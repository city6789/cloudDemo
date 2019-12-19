package cn.ztzh.cloud.test.testCloudDemo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware{

	private static ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtils.context = applicationContext;
		
	}
	public static ApplicationContext getContext() {
		return context;
	}

	
	public static Object getBean(String name) {
		return context.getBean(name);
	}
	
	public static <T> Object getBean(Class<T> cl) {
		return context.getBean(cl);
	}

}
