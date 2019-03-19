package com.linlin.shop.dao;

import com.linlin.shop.domain.Favorite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;


@Mapper
@Repository
public interface FavoriteDao {
     List<Favorite> list();
     int addfavorite(Favorite favorite);
     int updatefavorite(Favorite favorite);
     int deletefavorite(int id);
     Favorite findById(Integer id);


}
