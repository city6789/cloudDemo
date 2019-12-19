package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TradeScoreEventServerImpl extends ScoreEventAbstract{


	@Override
	protected boolean validateQualification(Map<String, Object> map) {
		System.out.println("活动积分判断。。。返回true");
		return true;
	}
	@Override
	protected void calculateScore(Map<String, Object> map) {
		System.out.println("活动积分计算。。。");
	}


}
