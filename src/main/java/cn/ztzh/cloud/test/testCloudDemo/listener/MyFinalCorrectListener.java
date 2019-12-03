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
	            log.info("================:{}", "ContextStartedEvent");
	        }
	        if (event instanceof ContextRefreshedEvent){
	            log.info("================:{}", "ContextRefreshedEvent");
	        }
	        if (event instanceof ContextClosedEvent){
	            log.info("================:{}", "ContextClosedEvent");
	        }
	        if (event instanceof ContextStoppedEvent){
	            log.info("================:{}", "ContextStoppedEvent");
	        }
	        if (event instanceof WebServerInitializedEvent){
	            log.info("================:{}", "EmbeddedServletContainerInitializedEvent");
	        }
	        if (event instanceof ApplicationReadyEvent){
	            log.info("================:{}", "ApplicationReadyEvent");
	        }
		
	}

}
