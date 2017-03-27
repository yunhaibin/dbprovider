/**   
* @Title: TestObjectService.java
* @Package cn.nickid.db.leancloud
* @Description: TODO(用一句话描述该文件做什么)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午5:00:09
* @version V1.0
*/
package cn.nickid.db.leancloud.service;

import java.util.List;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;

import cn.nickid.dbapi.leancloud.service.UserInfoService;
import cn.nickid.dbapi.req.UserReq;
import cn.nickid.dbapi.res.UserRes;

/** 
* @ClassName: TestObjectService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午5:00:09
*  
*/
public class UserInfoServiceImpl implements UserInfoService {
	/** 
	* @Title: saveUserInfo
	* @Description: TODO(保存用户信息)
	* @param @param userInfo    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public void saveUserInfo(AVObject userInfo) {
		
	}
	
	public UserRes getUserInfoByUserName(UserReq userReq) throws AVException {
		String userName = userReq.getName();
		UserRes userRes = new UserRes();
		
		AVObject userInfo = new AVObject("UserInfo");
		
		AVQuery<AVObject> avQuery = new AVQuery<>("UserInfo");
		avQuery.whereEqualTo("userName", userName);
		List<AVObject> userInfos = avQuery.find();
		if(userInfos.size() >= 1) {
			userInfo = userInfos.get(0);
			userRes.setId(userInfo.getInt("id"));
			userRes.setAge(userInfo.getInt("age"));
			userRes.setName(userInfo.getString("userName"));
		}
		return userRes;
	}
}
