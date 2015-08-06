package com.stem.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
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
import com.stem.core.constant.ProductUpDownConstant;
import com.stem.entity.Product;
import com.stem.entity.ProductActivity;
import com.stem.entity.ProductActivityExample;
import com.stem.entity.ProductExample;
import com.stem.service.EatActivityService;
import com.stem.service.ProductService;

@Controller
@RequestMapping("pro")
public class ProductController extends AjaxConroller{

	private ProductService productService;
	
	private EatActivityService eatActivityService;
	
	@RequestMapping("index")
	public String index(Integer pageIndex, Model model){
		ProductExample example = new ProductExample();
		example.createCriteria().andUpDownEqualTo(ProductUpDownConstant.UP.value());
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
	public void ajaxData(Integer pageIndex, PrintWriter pw){
		ProductExample example = new ProductExample();
		if(null==pageIndex || pageIndex<=0)
			return;
		int count = this.productService.countByExample(example);
		Pagination<Product> page = new Pagination<Product>(count, pageIndex);
		List<Product> data = new ArrayList<Product>();
		if(page.getPages()>=pageIndex){
			PageHelper.startPage(pageIndex, Pagination.ROWS);
			data = this.productService.selectByExample(example);
		}
		page.setData(data);
		JSONObject result = new JSONObject();
		result.put("errcode", ErrorConstant.OPERATION_SUCCESS);
		result.put("page", page);
		String json = result.toJSONString();
		writeJson(json);
	}

	/**
	 * @author: Samite stem zhang
	 * @modifyTime：2015年8月6日 下午2:34:13<br/>
	 * @description：获取产品详细页面内容<br/>
	 * @return 产品详细视图
	 */
	@RequestMapping("detail")
	public String renderDetail(Integer serial, Model model){
		if(serial==null){
			serial = 0;
		}
		Product bean = this.productService.selectByPrimaryKey(serial);
		model.addAttribute("bean",bean);
		return "fore/product/product_detail";
	}
	
	/**
	 * @author: Samite stem zhang
	 * @modifyTime：2015年8月6日 下午2:41:45<br/>
	 * @description：团购活动<br/>
	 * @return
	 */
	@RequestMapping("group")
	public String renderGroupBuy(Model model){
		ProductActivityExample example = new ProductActivityExample();
		Date now = new Date();
		example.createCriteria().andStartDateLessThan(now).andEndDateGreaterThan(now);
		List<ProductActivity> list = this.eatActivityService.list(example);
		if(list.size()>0){
			ProductActivity bean = list.get(0);
			model.addAttribute("bean",bean);
		}
		return "fore/product/product_activity";
	}
	
	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Resource
	public void setEatActivityService(EatActivityService eatActivityService){
	
		this.eatActivityService = eatActivityService;
	}
}