/**   
* @Title: ContainerStartup.java
* @Package cn.nickid.db.util
* @Description: TODO(容器启动工具)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午2:03:04
* @version V1.0
*/
package cn.nickid.db.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @ClassName: ContainerStartup
* @Description: TODO(容器启动工具)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午2:03:04
*  
*/
public class ContainerStartup {
	/** 
	* @Title: main
	* @Description: TODO(服务启动)
	* @param @param args
	* @return void
	* @throws 
	*/
	//test commit
	public static void main(String[] args) {
		System.out.println("------------Container startup......---------------");
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		context.registerShutdownHook();
		System.out.println("------------Container started......----------------");
		context.start();
		synchronized (ContainerStartup.class) {
			while (true) {
				try {
					ContainerStartup.class.wait();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}
}
