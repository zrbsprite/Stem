package com.penzias.component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.interfaces.IDictionaryType;
import com.penzias.service.SmCodeitemService;


public class LocalCacheDictionaryItem implements IDictionaryType, InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private Map<String, SmCodeitem> dictionary = new HashMap<String, SmCodeitem>();
	
	private SmCodeitemService smCodeitemService;
	
	@Override
	public void addOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.add(model);
			dictionary.put(model.getCodeid()+"_"+model.getCode(),model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.deleteById(model.getCodeid());
			dictionary.remove(model.getCodeid()+"_"+model.getCode());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.updateById(model);
			dictionary.put(model.getCodeid()+"_"+model.getCode(),model);
		} catch (Exception e){
			logger.error("更新字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public Object list(){
		return dictionary;
	}

	@Override
	public Object queryOne(Object object){
		String key = (String) object;
		return dictionary.get(key);
	}

	@Override
	public void afterPropertiesSet() throws Exception{
		logger.info("开始内存化字典类别数据……");
		List<SmCodeitem> list = this.smCodeitemService.list(new SmCodeitemExample());
		for(SmCodeitem sm : list){
			dictionary.put(sm.getCodeid()+"_"+sm.getCode(),sm);
		}
		logger.info("结束内存化字典类别数据……");
	}

	
	public void setSmCodeitemService(SmCodeitemService smCodeitemService){
	
		this.smCodeitemService = smCodeitemService;
	}
}
