package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.FavoriteDao;
import com.linlin.shop.domain.Favorite;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FavoriteController {

    @Autowired
    private FavoriteDao favoritedao;

//显示列表
    @GetMapping(value="/favorite")
    @ResponseBody
    public String List(){
    List<Favorite> list=favoritedao.list();
        JSONArray jsonArray = new JSONArray();
        list.forEach((f)->{
            jsonArray.add(f.toJSONObject());
        });
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",jsonArray);
       Msg success =  Msg.success();
       success.add("data",jsonArray);
        return success.toString();
    }

//    删除
    @PostMapping(value="/favorite")
    @ResponseBody
    public String deletefavorite(@RequestParam int id){
        Favorite n = favoritedao.findById(id);

        Favorite favorite = new Favorite();
        if(n==null){
            return Msg.error().toString();
        }else{
            favorite.setId(id);
            favoritedao.deletefavorite(id);
            return Msg.success().toString();
        }

    }

}
