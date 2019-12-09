package cn.ztzh.cloud.test.testCloudDemo.listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author hsy02
 *
 */
@Component
public class FeignBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (containsBeanDefinition(beanFactory, "feignContext", "eurekaAutoServiceRegistration")) {
            BeanDefinition bd = beanFactory.getBeanDefinition("feignContext");
            bd.setDependsOn("eurekaAutoServiceRegistration");
        }
        
        if (containsBeanDefinition(beanFactory, "feignContext", "eurekaAutoServiceRegistration")) {
            BeanDefinition bd = beanFactory.getBeanDefinition("feignContext");
            bd.setDependsOn("eurekaAutoServiceRegistration");
            bd.setDependsOn("applicationcontext ");
        }
    }

	//判断beans是否存在于beanFactory中
    private boolean containsBeanDefinition(ConfigurableListableBeanFactory beanFactory, String... beans) {
        return Arrays.stream(beans).allMatch(b -> beanFactory.containsBeanDefinition(b));
    }
    
    private static boolean containsBeanDefinition2(List<String> beanFactory, String... beans) {
    	
        return Arrays.stream(beans).allMatch(b -> beanFactory.contains(b));
    }
    
    public static void main(String[] args) {
    	List<String>  list=new ArrayList<String>();
    	 list.add("a");
    	 list.add("b");
    	 list.add("c");
    	 String[] stringArray = new String[3];
    	 stringArray[0]="c";
    	 stringArray[1]="b";
    	 stringArray[2]="a";
    	 System.out.println(containsBeanDefinition2(list,stringArray));
	}

}
