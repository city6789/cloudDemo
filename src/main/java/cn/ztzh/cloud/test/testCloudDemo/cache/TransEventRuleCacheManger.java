package cn.ztzh.cloud.test.testCloudDemo.cache;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.ztzh.cloud.test.testCloudDemo.dto.TransEventRuleDto;
import cn.ztzh.cloud.test.testCloudDemo.entity.ZsTExecuteTaskEntity;

@Component
public class TransEventRuleCacheManger {
	
	public TransEventRuleDto getTansEventRule(String eventCode) {
		
		TransEventRuleDto dto = new TransEventRuleDto();
		
		dto.setCode("");
		dto.setId("");
		dto.setCreateTime(new Date());
		dto.setUpdateTime(dto.getCreateTime());
		dto.setName("");
		
		List list = new ArrayList();
		ZsTExecuteTaskEntity entity1 = new ZsTExecuteTaskEntity();
		
		
		ZsTExecuteTaskEntity entity2 = new ZsTExecuteTaskEntity();
		
		list.add(entity1);
		list.add(entity2);
		dto.setExecuteTasks(list);
		return dto;
	}

}
