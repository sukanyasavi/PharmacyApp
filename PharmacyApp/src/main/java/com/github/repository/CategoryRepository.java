package com.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.model.Category;
import com.github.model.User;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
