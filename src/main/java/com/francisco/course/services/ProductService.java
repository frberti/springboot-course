package com.francisco.course.services;

import com.francisco.course.entities.Product;
import com.francisco.course.entities.User;
import com.francisco.course.repositories.ProductRepository;
import com.francisco.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    public Product findById(Long id){
        Optional<Product> opt = productRepository.findById(id);
        return opt.get();
    }

}
