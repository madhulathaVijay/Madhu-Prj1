package com.eval.coronakit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eval.coronakit.entity.ProductMaster;
import com.eval.coronakit.service.ProductService;
import com.eval.coronakit.service.ProductServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	ProductServiceImpl prodServiceImpl=new ProductServiceImpl();
	@Autowired
	ProductService productService;
	
	@GetMapping("/header")
	public String home() {
		return "admin-home";
	}
	
	@GetMapping("/product-entry")
	public String productEntry(Model model) {
		ProductMaster pm = new ProductMaster();
		model.addAttribute("product",pm);
		return "add-new-item";
	}
	
	@PostMapping("/product-save")
	public String productSave(@ModelAttribute("product") ProductMaster product) {
		
		prodServiceImpl.addNewProduct(product);
		return "show-all-item-admin";
	}
	

	@GetMapping("/product-list")
	public String productList(Model model) {
		List<ProductMaster> lp = prodServiceImpl.getlistallproducts();
		model.addAttribute("listProducts", lp );
		return "show-all-item-admin";
	}


	@GetMapping("/product-delete/{productId}")
	public String productDelete(@PathVariable("productId") int productId) {
		prodServiceImpl.deleteProduct(productId);
		return "show-all-item-admin";
	}
	
}
