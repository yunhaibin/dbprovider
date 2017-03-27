/*
 * 文 件 名:  BaseDAO.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2014-3-31,  All rights reserved  
 */
package cn.nickid.db.dao;

import java.util.List;
import java.util.Map;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author yunhaibin
 * @version [版本号, 2015-9-17]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface BaseDAO {
	/**
	 * 添加
	 * 
	 * @param entity
	 * @return
	 */
	public Object insert(String sqlname, Object parameterObject);

	/**
	 * 删除
	 * 
	 * @param entity
	 * @return
	 */
	public Integer delete(String sqlName, Object parameterObject);

	/**
	 * 修改
	 * 
	 * @param entity
	 * @return
	 */
	public Integer update(String sqlName, Object parameterObject);

	/**
	 * 查询
	 * 
	 * @param entity
	 * @return
	 */
	// public Object select(String sqlName, Object parameterObject);

	public List<Object> select(String sqlName, Map<String, Object> paratemObject);

	public List<Object> select(String sqlName, Object parameterObject);

	/**
	 * 查询单个
	 * 
	 * @param entity
	 * @return
	 */
	public Object findBy(String sqlName, Map<String, Object> paratemObject);

	public Object findBy(String sqlName, Object parameterObject);

}
