package com.stem.core.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BasicService<T, E> {

	public List<E> list(T example);
	
	public E getByPK(Integer id);
	
	public int getTotal(T example);
	
	public int update(@Param("model") E model, @Param("example") T example);

	public int updateByPK(@Param("model") E model);
	
	public int deleteByPK(Integer id);

	public int delete(T example);
	
	public int add(@Param("model") E model);
}
