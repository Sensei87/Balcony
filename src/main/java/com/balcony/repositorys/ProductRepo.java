package com.balcony.repositorys;


import com.balcony.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer>{

    List<Product> findById(int id);

}
