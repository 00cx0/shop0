package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.ProductDao;
import com.linlin.shop.domain.Product;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductDao productdao;

//    添加商品
    @PostMapping("/product")
    @ResponseBody
    public String addProduct(@RequestParam String productname, @RequestParam String productprice, String introduce, String productpicture) {

        Product num = productdao.findByProductname(productname);

        if (num != null && null!=num.getProductname()) {
            return Msg.error().toString();
        } else {
            Product product = new Product();
            product.setProductname(productname);
            product.setProductprice(productprice);
            product.setIntroduce(introduce);
            product.setProductpicture(productpicture);
            int flag = productdao.addproduct(product);
            if (flag>0) {
                return Msg.success().toString();
            } else {
                return Msg.error().toString();
            }
        }
    }

    @RequestMapping(value="/product")
    @ResponseBody
    public String List(){
        List<Product> list=productdao.list();
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

}
