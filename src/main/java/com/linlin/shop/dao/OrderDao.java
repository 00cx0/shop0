package com.linlin.shop.dao;

import com.linlin.shop.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OrderDao {
     List<Order> list();
     int addorder(Order order);
     int deleteorder(int id);
     Order findById(Integer id);

}
