package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.Category;
import com.github.model.SubCategory;
import com.github.repository.CategoryRepository;
import com.github.repository.SubCategoryRepository;
import com.github.service.CategoryService;
import com.github.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	SubCategoryRepository subcategoryRepository;
	@Override
	public List<SubCategory> getallsubcategories() {
		return subcategoryRepository.findAll();
	}

	@Override
	public SubCategory savesubCategory(SubCategory subcategory) {
		return subcategoryRepository.save(subcategory);
	}

	@Override
	public void deletesubCategory(long subCategoryId) {
		subcategoryRepository.delete(subCategoryId);		
	}

	@Override
	public void updatesubcategorytype(SubCategory subcategory) {
		subcategoryRepository.save(subcategory);		
		
	}
}

