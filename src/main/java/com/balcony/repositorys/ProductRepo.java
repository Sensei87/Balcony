package com.balcony.repositorys;


import com.balcony.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer>{

}