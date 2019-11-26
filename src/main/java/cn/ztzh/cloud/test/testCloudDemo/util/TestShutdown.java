package cn.ztzh.cloud.test.testCloudDemo.util;


import java.util.concurrent.ExecutorService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * 测试用例
 * @author heshiyang
 *
 */
@Component
public class TestShutdown {
//	@Autowired
//	private AsyncTask task;
	//@Autowired
	//private TaskExecutor taskExecutor;
	
//@Autowired
//@Qualifier("taskExecutor1")
//private ThreadPoolTaskExecutor pool1;
//ThreadPoolTaskExecutor
	     
	     
	    @Async
	    public void sayHello(String name) {
	        try {
	        	LoggerFactory.getLogger(TestShutdown.class).info(name+"-->ThreadName="+Thread.currentThread().getName());
	        	//task.searchEverything(name);
	        	//System.out.println(",ThreadName="+Thread.currentThread().getName());
	        	//System.out.println("TestShutdown,ThreadName="+Thread.currentThread().getName()+"isInterrupted1="+Thread.currentThread().isInterrupted());
	        	Thread.sleep(2*1000);
	        	//System.out.println(Thread.currentThread().getName()+"isInterrupted2="+Thread.currentThread().isInterrupted());
				//System.out.println("2.threadCount===="+threadCount);
			} catch (InterruptedException e) {
				System.err.println("TestShutdown 我输出了异常信息,e="+e);
				e.printStackTrace();
			}
	    }
}
