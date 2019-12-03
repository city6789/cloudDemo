package cn.ztzh.cloud.test.testCloudDemo.listener;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * 
 * @author hsy02
 *
 */
@Component
public class MyTestListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("333="+event.getClass().getName());
		
	}
	
	public void onApplicationEvent(ApplicationContextEvent event) {
		if (event.getApplicationContext().getParent()==null) {
			String name = event.getApplicationContext().getApplicationName();
			System.err.println("name = "+name);
		}
			String name = event.getApplicationContext().getApplicationName();
			System.err.println("name2 = "+name);
		
	}

}
