package cn.ztzh.cloud.test.testCloudDemo.util;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class TaskPoolConfig implements AsyncConfigurer{

	   @Bean//(name = "backExecutor")
	    public Executor backExecutor(){
	        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
	        taskExecutor.setCorePoolSize(3);
	        taskExecutor.setMaxPoolSize(30);
	        taskExecutor.setQueueCapacity(1000);
	        // 空闲线程存活时间
	        taskExecutor.setKeepAliveSeconds(1);
	        taskExecutor.setThreadNamePrefix("taskExecutor--");
			//默认false,等待所有任务结束后再关闭线程池
	        taskExecutor.setWaitForTasksToCompleteOnShutdown(false);
			//默认0,设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是被没有完成的任务阻塞
	        taskExecutor.setAwaitTerminationSeconds(0);
	        taskExecutor.initialize();
	        return taskExecutor;
	    }

		@Override
		public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
			System.out.println("输出异常"+Thread.currentThread().getName());
			return null;
		}


	
}
