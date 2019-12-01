package cn.ztzh.cloud.test.testCloudDemo.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

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
	        ThreadPoolTaskExecutor asyncTaskThreadPool = new ThreadPoolTaskExecutor();
	        asyncTaskThreadPool.setCorePoolSize(3);
	        asyncTaskThreadPool.setMaxPoolSize(30);
	        asyncTaskThreadPool.setQueueCapacity(1000);
	        // 空闲线程存活时间
	        asyncTaskThreadPool.setKeepAliveSeconds(1);
	        asyncTaskThreadPool.setThreadNamePrefix("taskExecutor--");
			//默认false,等待所有任务结束后再关闭线程池
	        asyncTaskThreadPool.setWaitForTasksToCompleteOnShutdown(false);
			//默认0,设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是被没有完成的任务阻塞
	        asyncTaskThreadPool.setAwaitTerminationSeconds(60);
	        
	        asyncTaskThreadPool.setThreadFactory(new ThreadFactory() {
	        	private final AtomicLong index = new AtomicLong(1);
				@Override
				public Thread newThread(Runnable r) {
					 return new Thread(r, "Async-override-task-pool-thread-" + index.getAndIncrement());
				}
	        	
	        });
	        asyncTaskThreadPool.initialize();
	        return asyncTaskThreadPool;
	    }

		@Override
		public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
			System.out.println("www输出异常ThreadName=   "+Thread.currentThread().getName());
			return new AsyncExceptionHandle();
		}


	
}
