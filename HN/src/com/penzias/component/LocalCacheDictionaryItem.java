package com.penzias.component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.entity.SmCodeitemKey;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmCodeitemService;


public class LocalCacheDictionaryItem implements IDictionaryItem, InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private Map<String, Map<String, SmCodeitem>> dictionary = new HashMap<String, Map<String, SmCodeitem>>();
	
	private SmCodeitemService smCodeitemService;
	
	@Override
	public void addOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.add(model);
			Map<String, SmCodeitem> map = dictionary.get(model.getCodeid());
			if(null==map){
				map = new HashMap<>();
				dictionary.put(model.getCodeid(),map);
			}
			map.put(model.getCode(),model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.deleteById(model.getCodeid());
			dictionary.get(model.getCodeid()).remove(model.getCode());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.updateById(model);
			dictionary.get(model.getCodeid()).put(model.getCode(),model);
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
		SmCodeitemKey key = (SmCodeitemKey)object;
		Map<String, SmCodeitem> map = dictionary.get(key.getCodeid());
		return null==map?null:map.get(key.getCode());
	}

	@Override
	public void afterPropertiesSet() throws Exception{
		logger.info("开始内存化字典类别数据……");
		List<SmCodeitem> list = this.smCodeitemService.list(new SmCodeitemExample());
		for(SmCodeitem sm : list){
			Map<String, SmCodeitem> map = dictionary.get(sm.getCodeid());
			if(null==map){
				map = new HashMap<>();
				dictionary.put(sm.getCodeid(),map);
			}
			map.put(sm.getCode(),sm);
		}
		logger.info("结束内存化字典类别数据……");
	}
	
	@Override
	public Object queryGroup(Object params){
		String key = params.toString();
		return dictionary.get(key);
	}

	public void setSmCodeitemService(SmCodeitemService smCodeitemService){
		
		this.smCodeitemService = smCodeitemService;
	}
}
