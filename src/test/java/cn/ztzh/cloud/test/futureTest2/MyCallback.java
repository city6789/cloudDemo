package cn.ztzh.cloud.test.futureTest2;



import java.util.HashMap;
import java.util.Map;
 
 
public class MyCallback {
	Map<String, Object> initParams = new HashMap<String, Object>();
	
	public MyCallback(Map<String, Object> initParams){
		this.initParams = initParams;
	} 
	
	public ResponseResult doSomething(Map<String,Object> params){
		System.out.println("HERE:" + params);
		String result = "Found param pwid:" + params.get("pwid") 
			+ ",state:" + params.get("state");
		System.out.println("异步线程处理完成,结果：" + result);
		return ResponseResult.successResult("异步线程处理完成,结果：" + result);
	}
}
