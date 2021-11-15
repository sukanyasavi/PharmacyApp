package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.Category;
import com.github.repository.CategoryRepository;
import com.github.service.CategoryService;

@Service
public class categoryImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public List<Category> getallcategories() {
		return (List<Category>) categoryRepository.findAll();

	}

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);

	}

	@Override
	public void deleteCategory(long categoryId) {
		categoryRepository.delete(categoryId);

		
	}

	@Override
	public void updatecategorytype(Category category) {
		categoryRepository.save(category);		
	}

}
