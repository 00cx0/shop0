package com.linlin.shop.dao;

import com.linlin.shop.domain.Product;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductDao {

     List<Product> list();
     int addproduct(Product product);
     int updateproduct(Product product);
     int deleteproduct(Integer id);
     Product findByProductname(String productname);


}
