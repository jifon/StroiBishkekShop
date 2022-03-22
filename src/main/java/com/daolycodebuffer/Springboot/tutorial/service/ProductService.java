package com.daolycodebuffer.Springboot.tutorial.service;

import com.daolycodebuffer.Springboot.tutorial.model.Product;
import com.daolycodebuffer.Springboot.tutorial.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //1. Get all the Product lists
    public List<Product> listAll(){
        return  productRepository.findAll();
    }

    //2. Save () all PRODUCTS into the database
    public void save(Product product){
        productRepository.save(product);
    }

    //3. Get PRODUCT by ID  or Find Product by its id
    public Product get(Long id){
        return productRepository.findById(id).get();}

    //4. DELETE product by its id
    public void delete(Long id){
        productRepository.deleteById(id);
    }

}
