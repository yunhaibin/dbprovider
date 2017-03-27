/*
 * 文 件 名:  P6SpyLogger.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2014年4月2日,  All rights reserved  
 */
package cn.nickid.db.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.p6spy.engine.logging.appender.P6Logger;

/**
 * 控制台日志输出sql
 * 
 * @author sunpeng
 * @version [1.0, 2014年6月18日]
 * @since [中国移动手机营业厅BSS系统]
 */
public class P6SpySLogger  implements P6Logger {
    
	private static final Logger logger = LoggerFactory.getLogger("p6spy");
	
	private String lastEntry;
	
    public String getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(String lastEntry) {
        this.lastEntry = lastEntry;
    }

    @Override
    public void logException(Exception e) {
        if (logger.isDebugEnabled()) {
//            logger.debug(e.getMessage(), e);
        } else if (logger.isInfoEnabled()) {
//            logger.info(e.getMessage(), e);
        } else if (logger.isErrorEnabled()) {
            logger.error(e.getMessage(), e);
        } else if (logger.isWarnEnabled()) {
            logger.warn(e.getMessage(), e);
        }

    }

    /**
     * sql打印
     * @param connectionId
     * @param now
     * @param elapsed
     * @param category
     * @param prepared
     * @param sql
     */
    @Override
    public void logSQL(int connectionId, String now, long elapsed,
            String category, String prepared, String sql ) {
        if (!"resultset".equals(category)) {
            String logEntry = "sql:" + sql + " connectionId:" + connectionId + " now:"+now + " elapsed:" + elapsed + " category:" + category + " prepared:" + prepared ;
            if (logger.isInfoEnabled()) {
                logger.info(logEntry);
            } else if (logger.isDebugEnabled()) {
                logger.debug(logEntry);
            } else if (logger.isErrorEnabled()) {
                logger.error(logEntry);
            } else if (logger.isWarnEnabled()) {
                logger.warn(logEntry);
            }
        }
    }
    

    @Override
    public void logText(String text) {
        if (logger.isDebugEnabled()) {
//            logger.debug(text);
        } else if (logger.isInfoEnabled()) {
//            logger.info(text);
        } else if (logger.isErrorEnabled()) {
            logger.error(text);
        } else if (logger.isWarnEnabled()) {
            logger.warn(text);
        }
        lastEntry = text;
    }

    public static String trim(String sql) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = sql.length();
        boolean b = true;
        char c;
        while (i < n) {
            c = sql.charAt(i);
            switch (c) {
            case '"':
                b = false;
                sb.append(c);
                ++i;
                while (i < n) {
                    c = sql.charAt(i);
                    if (c == '"') {
                        if (i + 1 >= n || sql.charAt(i + 1) != '"') {
                            sb.append(c);
                            ++i;
                            break;
                        }
                        sb.append(c);
                        c = sql.charAt(i);
                    }
                    sb.append(c);
                    ++i;
                }
                break;
            case '\'':
                b = false;
                sb.append(c);
                ++i;
                while (i < n) {
                    c = sql.charAt(i);
                    if (c == '\'') {
                        if(n==i+1){
                            sb.append(c);
                            break ;
                        }
                        if (sql.charAt(i+1) != '\'') {
                            sb.append(c);
                            break;
                        }
                        sb.append(c);
                        ++i;
                        c = sql.charAt(i);
                    }
                    sb.append(c);
                    ++i;
                }
                break;
            case ' ':
                if (!b) {
                    b = true;
                    sb.append(c);
                }
                break;
            case '\n':
            case '\r':
            case '\t':
                if (!b) {
                    b = true;
                    sb.append(' ');
                }
                break;
            default:
                b = false;
                sb.append(c);
                break;
            }
            ++i;
        }
        return sb.toString();
    }
}