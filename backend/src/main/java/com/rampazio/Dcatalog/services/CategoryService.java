package com.rampazio.Dcatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rampazio.Dcatalog.entities.Category;
import com.rampazio.Dcatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
		
		
	}

}
