package com.francisco.course.repositories;

import com.francisco.course.entities.Category;
import com.francisco.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
