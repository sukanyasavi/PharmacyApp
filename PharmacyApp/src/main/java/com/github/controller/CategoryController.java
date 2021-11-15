package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Category;
import com.github.model.User;
import com.github.service.CategoryService;
import com.github.service.UserService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;


		@GetMapping( "/fetchcategoryList")
	@ResponseBody
	public List<Category> getallcategories() {
		return categoryService.getallcategories();
	}
	
	@PostMapping("/savecategory")
	@ResponseBody
	public Category saveCategory(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}
	
	@PutMapping("/updatecategoryList")
	@ResponseBody
	public Category updatecategorytype(@RequestBody Category category) {
		 categoryService.updatecategorytype( category);
		 return category;
	}
	
	@DeleteMapping("/deleteCategory/{categoryId}")
	@ResponseBody
	public void  deleteUser(@PathVariable("categoryId") long categoryId) {
		categoryService.deleteCategory(categoryId);
	
	}
}