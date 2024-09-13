package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Load;
import com.springrest.springrest.repository.LoadRepository;

@Service
public class LoadService {
	@Autowired
	private LoadRepository loadRepository;
	public Load saveLoad(Load load) {
		return loadRepository.save(load);
	}
	public Load findById(int loadid) {
		Optional<Load> load= loadRepository.findById(loadid);
		if(load.isEmpty()) {
			throw new RuntimeException("Load not found");
		}
		return load.get();
	}
	public List<Load> findAll() {
		return loadRepository.findAll();
	}
	public Load updateLoad(Load load) {
		Optional<Load> dbload= loadRepository.findById(load.getShipperId());
		if(dbload.isEmpty()) {
			throw new RuntimeException("Load not found");
		}
		Load existingLoad=dbload.get();
		existingLoad.setLoadingPoint(load.getLoadingPoint());
		return loadRepository.save(existingLoad);
	}
	public void deleteLoad(int id) {
		Optional<Load> dbload= loadRepository.findById(id);
		if(dbload.isEmpty()) {
			throw new RuntimeException("Load not found");
		}
		loadRepository.delete(dbload.get());

	}
	}


