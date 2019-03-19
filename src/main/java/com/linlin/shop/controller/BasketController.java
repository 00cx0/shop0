package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.BasketDao;
import com.linlin.shop.dao.OrderDao;
import com.linlin.shop.domain.Basket;
import com.linlin.shop.domain.Order;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BasketController {

    @Autowired
    private BasketDao basketdao;

//显示列表
    @GetMapping(value="/basket")
    @ResponseBody
    public String List(){
    List<Basket> list=basketdao.list();
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
    @PostMapping(value="/basket")
    @ResponseBody
    public String deleteBasket(@RequestParam int id){
            Basket n = basketdao.findById(id);
            Basket basket = new Basket();
        if(n==null){
            return Msg.error().toString();
        }else{
            basket.setId(id);
            basketdao.deletebasket(id);
            return Msg.success().toString();
        }

    }


}
