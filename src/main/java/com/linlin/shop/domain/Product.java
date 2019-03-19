package com.linlin.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.sf.json.JSONObject;

//@Data
//@EqualsAndHashCode(callSuper = false)
//@NoArgsConstructor
public class Product {

    private int id;
    private String productname;
    private String productprice;
    private String introduce;
    private String productpicture;

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

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    public JSONObject toJSONObject(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("productname",productname);
        jsonObject.put("introduce",introduce);
        jsonObject.put("productprice",productprice);
        jsonObject.put("productpicture",productpicture);
        return jsonObject;
    }

}
