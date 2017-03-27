/*
 * 文 件 名:  BaseServiceImp.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2014-3-31,  All rights reserved  
 */
package cn.nickid.db.service.impl;

import java.util.List;
import java.util.Map;

import cn.nickid.db.dao.BaseDAO;
import cn.nickid.db.service.BaseService;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author yunhaibin
 * @version [版本号, 2015-9-17]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class BaseServiceImpl implements BaseService {

	private BaseDAO baseDAO;

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	@Override
	public Object insert(String sqlname, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.insert(sqlname, parameterObject);
	}

	@Override
	public Integer delete(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.delete(sqlName, parameterObject);
	}

	@Override
	public Integer update(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.update(sqlName, parameterObject);
	}

	@Override
	public Object findByWrite(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.findBy(sqlName, parameterObject);
	}

	@Override
	public List<?> select(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.select(sqlName, parameterObject);
	}

	@Override
	public List<?> select(String sqlName, Map<String, Object> parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.select(sqlName, parameterObject);
	}

	@Override
	public Object findBy(String sqlName, Object parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.findBy(sqlName, parameterObject);
	}

	@Override
	public Object findBy(String sqlName, Map<String, Object> parameterObject) {
		// TODO Auto-generated method stub
		return baseDAO.findBy(sqlName, parameterObject);
	}

}
