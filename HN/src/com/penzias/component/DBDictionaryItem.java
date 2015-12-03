package com.penzias.component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.entity.SmCodeitemKey;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmCodeitemService;


public class DBDictionaryItem implements IDictionaryItem{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private SmCodeitemService smCodeitemService;
	
	@Override
	public void addOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.add(model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.deleteById(model.getCodeid());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.updateById(model);
		} catch (Exception e){
			logger.error("更新字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public Object list(){
		List<SmCodeitem> list = this.smCodeitemService.list(new SmCodeitemExample());
		Map<String, Map<String, SmCodeitem>> dictionary = new HashMap<String, Map<String, SmCodeitem>>();
		for(SmCodeitem sm : list){
			Map<String, SmCodeitem> map = dictionary.get(sm.getCodeid());
			if(null==map){
				map = new HashMap<>();
				dictionary.put(sm.getCodeid(),map);
			}
			map.put(sm.getCode(),sm);
		}
		return dictionary;
	}

	@Override
	public Object queryOne(Object object){
		SmCodeitemKey key = (SmCodeitemKey) object;
		return this.smCodeitemService.getById(key);
	}

	@Override
	public Object queryGroup(Object params){
		String key = params.toString();
		SmCodeitemExample example = new SmCodeitemExample();
		example.createCriteria().andCodeidEqualTo(key);
		List<SmCodeitem> list = this.smCodeitemService.list(example);
		Map<String, SmCodeitem> map = new HashMap<String, SmCodeitem>();
		for(SmCodeitem item : list){
			map.put(item.getCode(),item);
		}
		return map;
	}
	
	public void setSmCodeitemService(SmCodeitemService smCodeitemService){
	
		this.smCodeitemService = smCodeitemService;
	}
}
