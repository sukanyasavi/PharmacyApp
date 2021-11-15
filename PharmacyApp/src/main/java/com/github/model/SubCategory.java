package com.github.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUBCATEGORY")
public class SubCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SUB_CATEGORY_ID")
	private long subCategoryId;
	
	
	
	@Column(name="SUBCATEGORYCODE")
	private String SubCategoryCode;
	
	@Column(name="SUBCATEGORYDESCRIPTION")
	private String SubCategoryDescription;
	@Column(name="CATEGORY_ID")
	private int categoryId;
	public long getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getSubCategoryCode() {
		return SubCategoryCode;
	}
	public void setSubCategoryCode(String subCategoryCode) {
		SubCategoryCode = subCategoryCode;
	}
	public String getSubCategoryDescription() {
		return SubCategoryDescription;
	}
	public void setSubCategoryDescription(String subCategoryDescription) {
		SubCategoryDescription = subCategoryDescription;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public SubCategory() {
		super();
	}
	public SubCategory(long subCategoryId, String subCategoryCode, String subCategoryDescription, int categoryId) {
		super();
		this.subCategoryId = subCategoryId;
		this.SubCategoryCode = subCategoryCode;
		this.SubCategoryDescription = subCategoryDescription;
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", SubCategoryCode=" + SubCategoryCode
				+ ", SubCategoryDescription=" + SubCategoryDescription + ", categoryId=" + categoryId + "]";
	}
	
	
		
	



		
}

