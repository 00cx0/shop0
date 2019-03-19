package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.OrderDao;
import com.linlin.shop.domain.Order;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderDao orderdao;

    //    添加订单
    @PostMapping(value="/order")
    @ResponseBody
    public String addOrder(@RequestParam(required = false,defaultValue = "0") int id, @RequestParam(required = false) String receivername, @RequestParam(required = false) String address, @RequestParam(required = false) String phonenumber, @RequestParam(required = false) String payway, @RequestParam(required = false) String pricetotal,@RequestParam(required = false) String createtime) {
        //这里为了避免报错所以default 0,实际应该是不允许为空的，或者你加一个如果为0的判断
        Order order = new Order();
        order.setReceivername(receivername);
        order.setAddress(address);
        order.setPhonenumber(phonenumber);
        order.setPayway(payway);
        order.setPricetotal(pricetotal);
        order.setCreatetime(createtime);

        int flag = orderdao.addorder(order);
        if (flag>0) {
            return Msg.success().toString();
        } else {
            return Msg.error().toString();
        }
    }

}

