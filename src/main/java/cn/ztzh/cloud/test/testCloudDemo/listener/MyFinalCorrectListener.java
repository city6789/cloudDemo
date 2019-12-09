package cn.ztzh.cloud.test.testCloudDemo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * 最终使用Listener
 * @author heshiyang
 *
 */
public class MyFinalCorrectListener implements ApplicationListener{
	//Logger log = LoggerFactroy.getLogger
	private  final Logger log = LoggerFactory.getLogger(MyFinalCorrectListener.class);
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		  if (event instanceof ContextStartedEvent){
	            log.info("===:{}", "ContextStartedEvent");
	        }
	        if (event instanceof ContextRefreshedEvent){
	            log.info("===:{}", "ContextRefreshedEvent");
	        }
	        if (event instanceof ContextClosedEvent){
	            log.info("===:{}", "ContextClosedEvent");
	    		ThreadGroup group = Thread.currentThread().getThreadGroup();
	    		Thread[] s = findAllThread(group);
	        }
	        if (event instanceof ContextStoppedEvent){
	            log.info("===:{}", "ContextStoppedEvent");
	        }
	        if (event instanceof WebServerInitializedEvent){
	            log.info("===:{}", "EmbeddedServletContainerInitializedEvent");
	        }
	        if (event instanceof ApplicationReadyEvent){
	            log.info("===:{}", "ApplicationReadyEvent");
	        }
		
	}
	public Thread[] findAllThread(ThreadGroup currentGroup){
		  while (currentGroup.getParent()!=null){
		      // 返回此线程组的父线程组
		      currentGroup=currentGroup.getParent();
		  }
		  //此线程组中活动线程的估计数
		  int noThreads = currentGroup.activeCount();
		  System.out.println("线程数量："+noThreads);
		  Thread[] lstThreads = new Thread[noThreads];
		  //把对此线程组中的所有活动子组的引用复制到指定数组中。
		  currentGroup.enumerate(lstThreads);
		  for (Thread thread : lstThreads) {
			  System.out.println(thread);
		      System.out.println(" 线程id：" + thread.getId() + " 线程名称：" + thread.getName() + " ,线程状态：" + thread.getState()+ " ,线程Class：" + thread.getClass());
		      System.out.println();
		  }
		  return lstThreads;
		}

}
