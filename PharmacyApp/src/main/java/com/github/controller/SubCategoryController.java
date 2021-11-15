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
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Category;
import com.github.model.SubCategory;
import com.github.service.CategoryService;
import com.github.service.SubCategoryService;

@Controller
public class SubCategoryController {

	@Autowired
	SubCategoryService subcategoryService;


		@GetMapping( "/fetchsubcategoryList")
	@ResponseBody
	public List<SubCategory> getallsubcategories() {
		return subcategoryService.getallsubcategories();
	}
	
	@PostMapping("/savesubcategory")
	@ResponseBody
	public SubCategory savesubCategory(@RequestBody SubCategory subcategory) {
		return subcategoryService.savesubCategory(subcategory);
	}
	@PutMapping("/updatesubcategoryList")
	@ResponseBody
	public SubCategory updatesubcategorytype(@RequestBody SubCategory subcategory) {
		 subcategoryService.updatesubcategorytype( subcategory);
		 return subcategory;
	}

	
	@DeleteMapping("/deletesubCategory/{subCategoryId}")
	@ResponseBody
	public void  deleteSubCatogery(@PathVariable("subCategoryId") long subCategoryId) {
		subcategoryService.deletesubCategory(subCategoryId);
	}
	}
