package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import cn.ztzh.cloud.test.testCloudDemo.inter.EventService;

public abstract class ScoreEventAbstract implements EventService{

	@Override
	public void execute(Map<String, Object> map) {
		System.out.println(" Abstract 方法  ScoreEvent  执行了！  ");
		//1,资格判断
		boolean b = this.validateQualification(map);
		if (b) {
			this.calculateScore(map);
		}
	}

	//积分计算
	protected abstract void calculateScore(Map<String, Object> map);

	//资格判断
	protected abstract boolean validateQualification(Map<String, Object> map);

	
	
	
	
	
	
	
	
}
