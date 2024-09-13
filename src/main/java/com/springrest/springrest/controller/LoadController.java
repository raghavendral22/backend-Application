package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.springrest.springrest.entity.Load;
import com.springrest.springrest.service.LoadService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/load")
public class LoadController {
	@Autowired
	private LoadService loadservice;
	@PostMapping("/load")
	public Load save(@RequestBody Load load) {
	return loadservice.saveLoad(load);
}
	@GetMapping("/loadId")
	public List<Load> findAll(){
		return loadservice.findAll();
	}
	@GetMapping("/load")
	public Load findById(@RequestParam int shipperId) {
		return loadservice.findById(shipperId);
	}
	@PutMapping("/loadId")
	public Load update(@RequestBody Load load) {
		return loadservice.updateLoad(load);
	}
	@DeleteMapping("/loadId")
	public void delete(@RequestParam int id) {
		loadservice.deleteLoad(id);
	}
}