package com.eval.coronakit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eval.coronakit.entity.CoronaKit;
import com.eval.coronakit.entity.KitDetail;
import com.eval.coronakit.entity.ProductMaster;
import com.eval.coronakit.service.CoronaKitService;
import com.eval.coronakit.service.CoronaKitServiceImpl;
import com.eval.coronakit.service.KitDetailService;
import com.eval.coronakit.service.KitDetailServiceImpl;
import com.eval.coronakit.service.ProductService;

@Controller
@RequestMapping("/user")
public class UserController {
	KitDetailServiceImpl kd = new KitDetailServiceImpl();
	CoronaKitServiceImpl cs = new CoronaKitServiceImpl();
	
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CoronaKitService coronaKitService;
	
	@Autowired
	KitDetailService kitDetailService;
	
	@RequestMapping("/home")
	public String home() {
		return "user-home";
	}
	
	@RequestMapping("/show-list")
	public String showList(Model model) {
		List<CoronaKit> lp = cs.getKit();
		model.addAttribute("coronaKit", lp );
		return "show-all-item-user";
	}
	
	@RequestMapping("/checkout/{Id}")
	public String checkout(Model model, int Id) {

		List<KitDetail> detail=	kd.getAllKitItemsOfAKit(Id);
		model.addAttribute("kitDetails", detail );
		return "show-summary";
	}
	
	@RequestMapping("/delete/{itemId}")
	public String deleteItem(@PathVariable("itemId") int itemId) {
		kd.deleteKitItem(itemId);
		return "show-all-item-user";
	}
}
