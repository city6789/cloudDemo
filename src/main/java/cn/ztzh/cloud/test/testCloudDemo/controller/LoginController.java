package cn.ztzh.cloud.test.testCloudDemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ztzh.cloud.test.testCloudDemo.inter.TransEventService;
//import cn.ztzh.cloud.test.testCloudDemo.util.AsyncTask;
import cn.ztzh.cloud.test.testCloudDemo.util.TestShutdown;


/**
 * controller入口
 * 
 * @author heshiyang
 *
 */
@RestController
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	/*
	 * @RequestMapping("/hello") // @ResponseBody public String mylogin() { return
	 * "Hello World"; }
	 */

	@Autowired
	private TransEventService transEventService;
	
	@Autowired
	private TestShutdown helloA;
	
	  @RequestMapping("/hello")
	  @ResponseBody 
	  public List<String> mylogin() { 
		  System.err.println("helloA="+helloA);
		  //log.info("登录状态：{ }",true);
	  //return "我是第一个登录接口";
	  
	  List list = new ArrayList(); 
	  list.add("a,");
	  list.add("b,"); 
	  list.add("c,"); 
	  System.out.println(list);
	  //AsyncTask task = new AsyncTask();
	  int a = 1;
	  for (int i = 0; i < a; i++) {
			  //task.tesTask(i);
		  try {
			  log.info("Cloud使用占位符打印的There are now {} user accounts: {},{}", i, list.get(i),list);
			  helloA.sayHello("aaa"+i);
		} catch (Exception e) {
			log.info(Thread.currentThread().getName()+"我输出了异常信息InterruptedException,e="+e+e.toString());
			e.printStackTrace();
		}
	  }
	  //log.info("{ }",list);
	  log.info("Cloud使用占位符打印的There are now {} user accounts: {}", list, true);    // faster
	  
	  Map map = new HashMap();
	  map.put("enentType", "firstActivate");
	  transEventService.runTrans(map);
	  return list; 
	  }
}
