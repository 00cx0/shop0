package com.linlin.shop.dao;

import com.linlin.shop.domain.Basket;
import com.linlin.shop.domain.Orderdetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OrderdetailDao {
     List<Orderdetail> list();
     int addordertail(Orderdetail orderdetail);
     int deleteordertail(int id);
     Basket findById(Integer id);


}
