package cn.ztzh.cloud.test.testCloudDemo.util;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import com.alibaba.fastjson.JSON;


public class AsyncExceptionHandle implements AsyncUncaughtExceptionHandler{
	private static final Logger log = LoggerFactory.getLogger(AsyncExceptionHandle.class);
	 public void handleUncaughtException(Throwable ex, Method method, Object... params) {
		 log.info("Async AsyncExceptionHandle: {} has uncaught exception,params:{}", method.getName(), JSON.toJSONString(params));
		 
		  if (ex instanceof AsyncException) {
		   AsyncException asyncException = (AsyncException) ex;
		   log.info("asyncException:{}",asyncException.getErrorMessage());
		  }
		 
		  log.info("Exception :");
		  ex.printStackTrace();
		 }

}
