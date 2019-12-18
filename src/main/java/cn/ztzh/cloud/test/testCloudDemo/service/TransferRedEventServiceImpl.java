package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import cn.ztzh.cloud.test.testCloudDemo.inter.EventService;

public class TransferRedEventServiceImpl implements EventService{

	@Override
	public void execute(Map<String, Object> map) {
		System.out.println("TransferRedEventServiceImpl 执行红包核销333");
	}

}
