/*
 * 文 件 名:  TestServiceImpl.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2015-9-17,  All rights reserved  
 */
package cn.nickid.db.serviceimpl;

import cn.nickid.db.service.impl.BaseServiceImpl;
import cn.nickid.dbapi.req.UserReq;
import cn.nickid.dbapi.res.UserRes;
import cn.nickid.dbapi.service.UserService;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  yunhaibin
 * @version  [版本号, 2015-9-17]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	/**
	 * 重写方法
	 * @param userReq
	 * @return
	 */
	@Override
	public UserRes getUser(UserReq userReq) {
		UserRes userRes = new UserRes();
		userRes = (UserRes) super.findBy("findBy.userRes", userReq);
		return userRes;
	}
	
}
