package com.github.service;

import java.util.List;

import com.github.model.Category;
import com.github.model.User;

public interface CategoryService {

List<Category> getallcategories();

	
	

	Category saveCategory(Category category);




	void deleteCategory(long categoryId);




	




	void updatecategorytype(Category category);


}
