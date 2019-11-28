package cn.ztzh.cloud.test.testCloudDemo;

import javax.annotation.PreDestroy;
import javax.servlet.ServletContextListener;
import javax.validation.constraints.NotNull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import cn.ztzh.cloud.test.testCloudDemo.listener.ExampleServletContextListener;

@SpringBootApplication
public class TestCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudDemoApplication.class, args);
	}

	@PreDestroy
	public void onExit() {
		System.out.println("@PreDestroy  ###STOPing###");
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
    	System.out.println("@PreDestroy  ###STOPThreadState: "+ Thread.currentThread().getState());
    	System.out.println("@PreDestroy  ###STOPThreadName:  "+ Thread.currentThread().getName());
    	System.out.println("@PreDestroy  ###STOPThreadId:  "+ Thread.currentThread().getId());
		System.out.println("@PreDestroy  ###STOP FROM THE LIFECYCLE###");
	}

	@NotNull
	@Bean
	ServletListenerRegistrationBean<ServletContextListener> myServletListener() {
		ServletListenerRegistrationBean<ServletContextListener> srb = new ServletListenerRegistrationBean<>();
		srb.setListener(new ExampleServletContextListener());
		return srb;
	}
}
