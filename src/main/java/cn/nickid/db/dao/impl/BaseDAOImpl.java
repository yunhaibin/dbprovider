/*
 * 文 件 名:  BaseDAOImp.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2014-3-31,  All rights reserved  
 */
package cn.nickid.db.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.nickid.db.dao.BaseDAO;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author yunhaibin
 * @version [版本号, 2015-9-17]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SuppressWarnings("deprecation")
public class BaseDAOImpl extends SqlMapClientDaoSupport implements BaseDAO {

	@Override
	public Object insert(String sqlname, Object parameterObject) {

		return getSqlMapClientTemplate().insert(sqlname, parameterObject);
	}

	@Override
	public Integer delete(String sqlName, Object parameterObject) {
		return getSqlMapClientTemplate().delete(sqlName, parameterObject);
	}

	@Override
	public Integer update(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().update(sqlName, parameterObject);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> select(String sqlName, Map<String, Object> paratemObject) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList(sqlName, paratemObject);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> select(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub

		return getSqlMapClientTemplate().queryForList(sqlName, parameterObject);
	}

	@Override
	public Object findBy(String sqlName, Map<String, Object> paratemObject) {
		return getSqlMapClientTemplate().queryForObject(sqlName, paratemObject);
	}

	@Override
	public Object findBy(String sqlName, Object parameterObject) {
		return getSqlMapClientTemplate().queryForObject(sqlName, parameterObject);
	}

	// @Override
	// public Object select(String sqlName, Object parameterObject) {
	//
	// return getSqlMapClientTemplate().queryForObject(sqlName,
	// parameterObject);
	// }

}
