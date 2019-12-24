package cn.ztzh.cloud.test.futureTest2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


/**
 * 主线程类为FutureTest2，异步任务类为MyTask2，回调类为MyCallback。将回调处理类作为参数传给异步任务类myTask2，
 * 当任务结束时，调用回调处理类MyCallback的回调函数，完成任务结束后的“后处理”。
 * @author hsy02
 *
 */

public class FutureTest2 {
	Map<String, Object> initParams = new HashMap<String,Object>(); 
	
	ExecutorService executorService = Executors.newFixedThreadPool(3);
	
	public void test1(){
		initParams.put("clsId","clsId-001");
		initParams.put("ids", "001,002,003,004"); 
		
		MyCallback myCallback = new MyCallback(initParams);
		FutureTask<ResponseResult> futureTask = new FutureTask<>(new MyTask2(myCallback));	
		executorService.submit(futureTask);  
		System.out.println("HERE!!!");
	}  
	
	
	/**
	 * 关闭线程池
	 */
	public void closeThreadPool(){
		executorService.shutdown();
	}  
	
	
	/**
	 * 测试主入口
	 * @param args
	 */
	public static void main(String[] args) {
		FutureTest2 ft = new FutureTest2();
		ft.test1();
 
		System.out.println("Do other things...");
		ft.closeThreadPool();
	}
}

