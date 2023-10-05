package com.poly.hangnt169.sof3021.B10_JPA.repository;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
