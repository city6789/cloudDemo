package cn.ztzh.cloud.test.testCloudDemo.huhanlin;

/*import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.catalina.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;*/

/**
 * 
 * @author heshiyang
 *
 */
//@Configurable
public class TomcatGentlyShutdownConfiguration {
	/**
     * 用于接受shutdown事件
     * @return
     */
    //@Bean
//    public GracefulShutdown gracefulShutdown() {
//        return new GracefulShutdown();
//    }
    
    /**
     * 用于注入 connector
     * @return
     */
    //@Bean
//    public EmbeddedServletContainerCustomizer tomcatCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                if (container instanceof TomcatEmbeddedServletContainerFactory) {
//                    ((TomcatEmbeddedServletContainerFactory) container).addConnectorCustomizers(gracefulShutdown());
//                }
//            }
//        };
//    }
    
//    private static class GracefulShutdown implements 
//    TomcatConnectorCustomizer, ApplicationListener<ContextClosedEvent> {
//
//        private static final Logger log = LoggerFactory.getLogger(GracefulShutdown.class);
//        private volatile Connector connector;
//        private final int waitTime = 30;
//
//        @Override
//        public void customize(Connector connector) {
//            this.connector = connector;
//        }
//
//        @Override
//        public void onApplicationEvent(ContextClosedEvent event) {
//        	//容器不接收新的请求
//            this.connector.pause();
//            //关闭容器的线程池
//            Executor executor = this.connector.getProtocolHandler().getExecutor();
//            if (executor instanceof ThreadPoolExecutor) {
//                try {
//                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
//                    threadPoolExecutor.shutdown();
//                    if (!threadPoolExecutor.awaitTermination(waitTime, TimeUnit.SECONDS)) {
//                        log.warn("Tomcat thread pool did not shut down gracefully within "
//                                + waitTime + " seconds. Proceeding with forceful shutdown");
//                    }
//                } catch (InterruptedException ex) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }
//    }
}
