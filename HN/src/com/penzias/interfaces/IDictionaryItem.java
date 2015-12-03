package com.penzias.interfaces;

import com.penzias.core.interfaces.IDBOperation;

/**
 * 描述：字典明细接口<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月2日 - 下午5:11:58<br/>
 */
public interface IDictionaryItem extends IDBOperation {

	public Object queryGroup(Object params);
}
