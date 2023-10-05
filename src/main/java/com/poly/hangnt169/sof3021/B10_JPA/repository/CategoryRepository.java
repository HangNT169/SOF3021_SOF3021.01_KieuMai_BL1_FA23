package com.poly.hangnt169.sof3021.B10_JPA.repository;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // CRUD 1 bang => K can viet JPA cung cap
//    // Custom SQL
//    // 1.Query creation
//    // 2.Raw SQL
//        // 1. Native query => Truy van tren SQL
//        // 2. JPQL(JPA Query Language) <=> HQL => Truy van tren thuc the (Entity)
//
//    @Query("SELECT c FROM Category c WHERE c.id1 = ?3 AND c.categoryCode = ?1")
//    List<Category> seach(String categoryCode, String categoryName, Long id);
//
//    @Query("SELECT c FROM Category c")
//    List<Category>getAll();

}
