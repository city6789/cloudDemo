package cn.ztzh.cloud.test.testCloudDemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExampleServletContextListener implements ServletContextListener{

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
       }
}
