package cn.ztzh.cloud.test.testCloudDemo;

import javax.annotation.PreDestroy;
import javax.servlet.ServletContextListener;
import javax.validation.constraints.NotNull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import cn.ztzh.cloud.test.testCloudDemo.listener.ExampleServletContextListener;
import cn.ztzh.cloud.test.testCloudDemo.listener.MyFinalCorrectListener;



//@EnableHystrix
//@EnableDiscoveryClient
@EnableCaching
//@EnableFeignClient
@EnableAsync
@ComponentScan("cn.ztzh.cloud.*")
@SpringBootApplication
public class TestCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudDemoApplication.class, args);
	}

	@PreDestroy
	public void onExit() {
		System.out.println("@PreDestroy  ###STOPing###");
		try {
			//Thread.sleep(10 * 1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		Thread[] s = null;//findAllThread(group);
//		System.out.println(s);
//    	System.out.println("@PreDestroy  ###STOPThreadState: "+ Thread.currentThread().getState());
//    	System.out.println("@PreDestroy  ###STOPThreadName:  "+ Thread.currentThread().getName());
//    	System.out.println("@PreDestroy  ###STOPThreadId:  "+ Thread.currentThread().getId());
	}

//	@NotNull
//	@Bean
//	ServletListenerRegistrationBean<ServletContextListener> myServletListener() {
//		ServletListenerRegistrationBean<ServletContextListener> srb = new ServletListenerRegistrationBean<>();
//		srb.setListener(new ExampleServletContextListener());
//		return srb;
//	}
	
	public Thread[] findAllThread(ThreadGroup currentGroup){

		  while (currentGroup.getParent()!=null){
		      // 返回此线程组的父线程组
		      currentGroup=currentGroup.getParent();
		  }
		  //此线程组中活动线程的估计数
		  int noThreads = currentGroup.activeCount();

		  Thread[] lstThreads = new Thread[noThreads];
		  //把对此线程组中的所有活动子组的引用复制到指定数组中。
		  currentGroup.enumerate(lstThreads);

		  for (Thread thread : lstThreads) {
			  System.out.println(thread);
		      System.out.println("线程数量："+noThreads+" 线程id：" + thread.getId() + " 线程名称：" + thread.getName() + " 线程状态：" + thread.getState()+ " 线程Class：" + thread.getClass());
		  }
		  return lstThreads;
		}
	
	@Bean
	public MyFinalCorrectListener appApplicationListener(){
		return new MyFinalCorrectListener();
	}
}
