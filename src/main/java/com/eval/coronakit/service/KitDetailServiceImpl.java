package com.eval.coronakit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eval.coronakit.dao.KitDetailRepository;
import com.eval.coronakit.entity.KitDetail;

@Service
public class KitDetailServiceImpl implements KitDetailService {

	@Autowired
	KitDetailRepository repository;
	
	@Override
	@Transactional
	public KitDetail addKitItem(KitDetail kitItem) {
		
		return repository.save(kitItem);
	}

	@Override
	public KitDetail getKitItemById(int itemId) {
		
		return repository.findById(itemId).get();
	}

	@Override
	public List<KitDetail> getAllKitItemsOfAKit(int kitId) {
		
		return repository.findAll();
	}
	
	public void deleteKitItem(int id){
	 repository.deleteById(id);
	}

}
