package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import cn.ztzh.cloud.test.testCloudDemo.inter.EventService;
@Service
public class TransferRedEventServiceImpl implements EventService{

	@Override
	public void execute(Map<String, Object> map) {
		System.out.println("普通方法   TransferRedEventServiceImpl 执行红包核销333");
	}

}
