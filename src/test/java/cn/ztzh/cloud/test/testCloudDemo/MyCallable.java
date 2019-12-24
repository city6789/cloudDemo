package cn.ztzh.cloud.test.testCloudDemo;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {
	private String taskNum;  
	  
	public MyCallable(String taskNum) {  
	   this.taskNum = taskNum;  
	}  

	@Override
	public Object call() throws Exception {
		 System.out.println("call  >>>" + taskNum + "任务启动");  
		   Date dateTmp1 = new Date();  
		   Thread.sleep(1000);  
		   Date dateTmp2 = new Date();  
		   long time = dateTmp2.getTime() - dateTmp1.getTime();  
		   System.err.println("call  >>>" + taskNum + "任务终止MyCallable");  
		   return taskNum + "call   任务返回运行结果,当前任务时间【" + time + "毫秒】";  
	}

}
