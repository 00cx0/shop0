package com.linlin.shop.dao;

import com.linlin.shop.domain.Basket;
import com.linlin.shop.domain.Favorite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface BasketDao {
     List<Basket> list();
     int addbasket(Basket basket);
     int deletebasket(int id);
     Basket findById(Integer id);


}
