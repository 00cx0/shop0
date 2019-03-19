package com.linlin.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.sf.json.JSONObject;

//@Data
//@EqualsAndHashCode(callSuper = false)
//@NoArgsConstructor
public class Favorite {

    private int id;
    private String username;
    private String productname;
    private String introduce;
    private String productprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public JSONObject toJSONObject(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("username",username);
        jsonObject.put("productname",productname);
        jsonObject.put("introduce",introduce);
        jsonObject.put("productprice",productprice);
        return jsonObject;
    }
}
