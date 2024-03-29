package com.eval.coronakit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eval.coronakit.dao.CoronaKitRepository;
import com.eval.coronakit.entity.CoronaKit;

@Service
public class CoronaKitServiceImpl implements CoronaKitService {

	@Autowired
	CoronaKitRepository repository;
	
	@Override
	public CoronaKit saveKit(CoronaKit kit) {
		return repository.save(kit);
	}

	@Override
	public CoronaKit getKitById(int kitId) {
		return repository.findById(kitId).get();
	}
	
	public List<CoronaKit> getKit(){
		return repository.findAll();
	}

}
