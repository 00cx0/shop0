package com.linlin.shop.domain;

import net.sf.json.JSONObject;

public class Basket {
    int id;
    String productname;
    String productnumber;
    String productprice;
    String pricesubtotal;
    String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getPricesubtotal() {
        return pricesubtotal;
    }

    public void setPricesubtotal(String pricesubtotal) {
        this.pricesubtotal = pricesubtotal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public JSONObject toJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("productname",productname);
        jsonObject.put("productnumber",productnumber);
        jsonObject.put("productprice",productprice);
        jsonObject.put("pricesubtotal",pricesubtotal);
        jsonObject.put("username",username);
        return jsonObject;
    }
}
