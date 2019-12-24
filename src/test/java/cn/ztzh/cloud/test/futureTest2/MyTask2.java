package cn.ztzh.cloud.test.futureTest2;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
 
 
public class MyTask2 implements Callable<ResponseResult>{ 	
 
	MyCallback myCallback = null;
	
	public MyTask2(MyCallback myCallback){
		this.myCallback = myCallback;
	}  
 
	@Override
	public ResponseResult call() throws Exception {
		System.out.println("Start processing...");
		//模拟处理过程
		Thread.sleep(10*1000); 
		Map<String, Object> params = new HashMap<String,Object>(); 
		params.put("pwid","pwid-001");
		params.put("state", "已退回");
		//模拟处理结束
		ResponseResult result = myCallback.doSomething(params);
		return result;
	}
}

