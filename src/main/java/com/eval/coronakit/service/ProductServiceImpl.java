package com.eval.coronakit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eval.coronakit.dao.ProductMasterRepository;
import com.eval.coronakit.entity.ProductMaster;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMasterRepository repository;
	
	@Override
	public ProductMaster addNewProduct(ProductMaster product) {
		repository.save(product);
		return product;
	}

	@Override
	public List<ProductMaster> getAllProducts() {
		
		return repository.findAll();
		
	}
	public List<ProductMaster> getlistallproducts() {
		
		ProductMaster m1= new ProductMaster(1, "Mask" ,10,"Face Mask");
		ProductMaster m2= new ProductMaster(2, "Sanitizer" ,100,"Hand Sanitizer");
		ProductMaster m3= new ProductMaster(3, "PPE Kit" ,5000,"PPE Kit");
		ProductMaster m4= new ProductMaster(4, "FaceShield" ,80,"FaceShield");
		List<ProductMaster> list = new ArrayList<ProductMaster>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		return list;
	}
	

	@Override
	public void deleteProduct(int productId) {
	   repository.deleteById(productId);
	}

	@Override
	public ProductMaster getProductById(int productId) {
		return repository.findById(productId).get();
	}

}
