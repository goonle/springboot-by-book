package com.junhuh741.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junhuh741.domain.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
