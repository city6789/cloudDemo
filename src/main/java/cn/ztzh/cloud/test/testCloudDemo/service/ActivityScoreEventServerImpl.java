package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

public class ActivityScoreEventServerImpl extends ScoreEventAbstract{


	@Override
	protected boolean validateQualification(Map<String, Object> map) {
		System.out.println("交易积分判断");
		return true;
	}
	@Override
	protected void calculateScore(Map<String, Object> map) {
		System.out.println("交易积分计算");
	}


}
