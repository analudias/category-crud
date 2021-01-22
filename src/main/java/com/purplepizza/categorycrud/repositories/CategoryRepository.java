package com.purplepizza.categorycrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purplepizza.categorycrud.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
