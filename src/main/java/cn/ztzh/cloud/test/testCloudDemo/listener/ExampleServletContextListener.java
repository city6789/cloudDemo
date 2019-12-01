package cn.ztzh.cloud.test.testCloudDemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class ExampleServletContextListener implements ServletContextListener{
	private ApplicationContext context;
    public void contextInitialized(ServletContextEvent sce) {
    	System.err.println("llll----Context Initialised");
        }

        @Override
        public void contextDestroyed(ServletContextEvent sce) {
        	System.out.println("ThreadState: "+ Thread.currentThread().getState());
        	System.out.println("ThreadName:  "+ Thread.currentThread().getName());
        	System.out.println("ThreadId:  "+ Thread.currentThread().getId());
        	System.out.println("ThreadSimpleName:  "+sce.getClass().getSimpleName() );
        	System.err.println("pppp----Context what you want to do that context shutdown?");
        	ConfigurableApplicationContext ctx = (ConfigurableApplicationContext) context;
        	ctx.close();
        	System.err.println("ApplicationContext  shutdown  完毕！");
       }

		public void setContext(ApplicationContext context) {
			this.context = context;
		}
}
