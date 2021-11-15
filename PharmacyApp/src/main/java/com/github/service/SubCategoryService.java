package com.github.service;

import java.util.List;

import com.github.model.SubCategory;

public interface SubCategoryService {

	List<SubCategory> getallsubcategories();

	SubCategory savesubCategory(SubCategory subcategory);

	void deletesubCategory(long subCategoryId);

	void updatesubcategorytype(SubCategory subcategory);

}
