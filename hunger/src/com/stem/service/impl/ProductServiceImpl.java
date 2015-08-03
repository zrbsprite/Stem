package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.ProductMapper;
import com.stem.entity.Product;
import com.stem.entity.ProductExample;
import com.stem.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private ProductMapper productMappper;
	
	@Override
	public List<Product> selectByExample(ProductExample example) {
		return this.productMappper.selectByExample(example);
	}


	@Override
	public Product selectByPrimaryKey(Integer id) {
		return this.productMappper.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ProductExample example) {
		return this.productMappper.countByExample(example);
	}

	@Override
	public int updateByExample(Product model, ProductExample example) {
		return this.productMappper.updateByExampleSelective(model, example);
	}

	@Override
	public int updateByPrimaryKey(Product model) {
		return this.productMappper.updateByPrimaryKey(model);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return this.productMappper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(ProductExample example) {
		return this.productMappper.deleteByExample(example);
	}

	public ProductMapper getProductMappper() {
		return productMappper;
	}

	@Resource
	public void setProductMappper(ProductMapper productMappper) {
		this.productMappper = productMappper;
	}
}
