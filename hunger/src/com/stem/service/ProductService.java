package com.stem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stem.entity.Product;
import com.stem.entity.ProductExample;

public interface ProductService {

	public List<Product> selectByExample(ProductExample example);
	
	public Product selectByPrimaryKey(Integer id);

	public int countByExample(ProductExample example);

	public int updateByExample(@Param("model") Product model, @Param("example") ProductExample example);

	public int updateByPrimaryKey(@Param("model") Product model);
	
	public int deleteByPrimaryKey(Integer id);

	public int deleteByPrimaryKey(ProductExample example);
	
}