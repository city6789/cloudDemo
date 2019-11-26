package cn.ztzh.cloud.test.testCloudDemo.listener;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.catalina.connector.Connector;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * 异常时执行事件
 * @author heshiyang
 *
 */

@Component
public class MyApplicationFailedEventListener implements 
ApplicationListener<ContextClosedEvent>{

	@Resource(name = "backExecutor")
    private ThreadPoolTaskExecutor backExecutor;
    private static int WAIT_TIME = 30;
    private volatile Connector connector;
    
    
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("监控到 FFF   ="+Thread.currentThread().getName()+" ContextClosedEvent"+DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
	    //Throwable throwable = event.getException();
	    //handleThrowable(throwable);
	    //shutdownAndAwaitTermination(backExecutor.getThreadPoolExecutor());
		
	}

//	private void shutdownAndAwaitTermination(ThreadPoolExecutor threadPoolExecutor) {
//		
//	}
	
	private void shutdownAndAwaitTermination(ExecutorService pool) {
		System.out.println(Thread.currentThread().getName()+" ---  FFF MyApplicationFailedEventListener 监控到shutdownAndAwaitTermination。。。。");
        pool.shutdown(); 
        try {
            if (!pool.awaitTermination(3, TimeUnit.SECONDS)) {
                pool.shutdownNow(); 
                if (!pool.awaitTermination(3, TimeUnit.SECONDS))
                    System.err.println("FFF MyApplicationFailedEventListener 监控到awaitTermination========");
            }
        } catch (InterruptedException ie) {
        	System.out.println("FFF MyApplicationFailedEventListener 监控到Exception。。。。");
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

	/*处理异常*/
    private void handleThrowable(Throwable throwable) {
    	//registerShutdownHook();
    	System.err.println("FFF MyApplicationFailedEventListener 监控到handleThrowable处理异常");
    }


//	private void registerShutdownHook() {
//		 if (this.shutdownHook == null) {
//			 // No shutdown hook registered yet. 
//			 this.shutdownHook = new Thread() {
//				 @Override 
//				 public void run() {
//					 doClose(); 
//					 } 
//				 }; 
//				 Runtime.getRuntime().addShutdownHook(this.shutdownHook);
//		 }
//		
//	}
    
	public void customize(Connector connector) {
		 this.connector = connector;
		
	}
}
