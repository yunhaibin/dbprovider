/**   
* @Title: InitAVOSCloud.java
* @Package cn.nickid.db.leancloud
* @Description: TODO(用一句话描述该文件做什么)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午3:35:09
* @version V1.0
*/
package cn.nickid.db.leancloud;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

/**
 * @ClassName: InitAVOSCloud
 * @Description: TODO(初始化leancloud)
 * @author yunhaibin nickid_qq_com
 * @date 2017年3月23日 下午3:35:09
 * 
 */
public class InitAVOSCloud {
	public InitAVOSCloud() {
		AVOSCloud.initialize("yJfVDsCMVHLCj63tqtohSKxS-gzGzoHsz", "OGdUsEShf3DrjdWqOK0WTj6u",
				"MPNLL4xCS1Q7N6nwPJmj26FD");
		AVOSCloud.setDebugLogEnabled(true);
	}
	
	public void saveTest() {
		AVObject testObject = new AVObject("UserInfo");
//		testObject.put("id", null);
		testObject.put("userName", "haibin");
		testObject.put("age", 31);
		try {
			testObject.save();
		} catch (AVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InitAVOSCloud().saveTest(); 
	}
}
