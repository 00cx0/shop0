package com.linlin.shop.dao;

import com.linlin.shop.domain.Blank;
import com.linlin.shop.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface BlankDao {
     List<Blank> list();
     int updateblank(Blank blank);
     Blank findById(Integer id);


}
