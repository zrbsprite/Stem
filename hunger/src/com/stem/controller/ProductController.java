package com.stem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.Pagination;
import com.stem.core.constant.ErrorConstant;
import com.stem.entity.Product;
import com.stem.entity.ProductExample;
import com.stem.service.ProductService;

@Controller
@RequestMapping("pro")
public class ProductController extends AjaxConroller{

	private ProductService productService;
	
	@RequestMapping("index")
	public String index(Integer pageIndex, Model model){
		ProductExample example = new ProductExample();
		if(null==pageIndex || pageIndex<=0)
			pageIndex = 1;
		int count = this.productService.countByExample(example);
		PageHelper.startPage(pageIndex, Pagination.ROWS);
		List<Product> data = this.productService.selectByExample(example);
		Pagination<Product> page = new Pagination<Product>(count, pageIndex);
		page.setData(data);
		model.addAttribute("page", page);
		return "fore/product/list";
	}

	@RequestMapping("data")
	public void ajaxData(Integer pageIndex){
		ProductExample example = new ProductExample();
		if(null==pageIndex || pageIndex<=0)
			return;
		int count = this.productService.countByExample(example);
		PageHelper.startPage(pageIndex, Pagination.ROWS);
		List<Product> data = this.productService.selectByExample(example);
		Pagination<Product> page = new Pagination<Product>(count, pageIndex);
		page.setData(data);
		JSONObject result = new JSONObject();
		result.put("errcode", ErrorConstant.OPERATION_SUCCESS);
		result.put("page", page);
		String json = result.toJSONString();
		writeJson(getResponse(), json);
	}
	
	public ProductService getProductService() {
		return productService;
	}

	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
}