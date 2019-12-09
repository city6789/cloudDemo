package cn.ztzh.cloud.test.testCloudDemo.listener;

import java.util.Date;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class CbJobStopListener implements ApplicationListener {
	@Resource(name = "backExecutor")
	private ThreadPoolTaskExecutor backExecutor;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
//		// 在spring bean容器销毁之前执行的事件，防止数据库连接池在任务终止前销毁
//		if (event instanceof ContextClosedEvent) {
//			System.out.println("八佰伴   监控到ContextClosedEvent事件 " + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
//			//stopJobs();
//		}
//
//		if (event instanceof ContextClosedEvent) {
//			stopJobs();
//			System.out.println(event.getClass().getSimpleName() + "  1Event has occurred...");
//		} else if (event instanceof ContextRefreshedEvent) {
//			System.out.println(event.getClass().getSimpleName() + "  2Event has occurred...");
//		} else if (event instanceof ContextStartedEvent) {
//			System.out.println(event.getClass().getSimpleName() + "  3Event has occurred...");
//		} else if (event instanceof ContextStoppedEvent) {
//			System.out.println(event.getClass().getSimpleName() + "  4Event has occurred...");
//		} else {
//			System.out.println("5There are other events   " + event.getClass().getName());
//		}
	}

	private void stopJobs() {
		System.out.println("stopJobs");
		//shutdownAndAwaitTermination(backExecutor.getThreadPoolExecutor());
	}

	private void shutdownAndAwaitTermination(ExecutorService pool) {
		System.out.println(Thread.currentThread().getName() + " 八佰伴EventListener 监控到shutdown2。。。。");
		pool.shutdown();
		try {
			if (!pool.awaitTermination(3, TimeUnit.SECONDS)) {
				pool.shutdownNow();
				if (!pool.awaitTermination(3, TimeUnit.SECONDS))
					System.out.println("---------八佰伴EventListener Pool did not terminate333========");
			}
		} catch (InterruptedException ie) {
			pool.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}

}
