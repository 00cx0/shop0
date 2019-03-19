package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.BlankDao;
import com.linlin.shop.domain.Blank;
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
public class BlankController {

    @Autowired
    private BlankDao blankdao;

    //    修改商品
    @PostMapping("/updateblank")
    @ResponseBody
    public String updateblank(@RequestParam int id , @RequestParam String blank) {
        id = 1;
        Blank n = blankdao.findById(id);

        if (n == null && null == n.getBlank()) {
            return Msg.error().toString();
        } else {
            Blank blank1 = new Blank();
            blank1.setId(id);
            blank1.setBlank(blank);
            blankdao.updateblank(blank1);
            System.out.println(blank1.getBlank());
            return Msg.success().toString();
        }

    }

    //显示留言信息
    @GetMapping(value="/viewblank")
    @ResponseBody
    public String viewublankList(@RequestParam int id){
        Blank num = blankdao.findById(id);
        List<Blank> list=blankdao.list();
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
