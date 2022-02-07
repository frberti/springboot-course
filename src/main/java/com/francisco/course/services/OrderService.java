package com.francisco.course.services;

import com.francisco.course.entities.Order;
import com.francisco.course.repositories.OrderRepository;
import com.francisco.course.services.exceptions.ExceptionTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.orElseThrow(() -> new ExceptionTest(id));
    }


}
