package com.francisco.course.repositories;

import com.francisco.course.entities.Category;
import com.francisco.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
