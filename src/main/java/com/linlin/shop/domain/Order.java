package com.linlin.shop.domain;

import net.sf.json.JSONObject;

public class Order {
    int id;
    String receivername;
    String address;
    String phonenumber;
    String createtime;
    String pricetotal;
    String payway;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }


    public String getPricetotal() {
        return pricetotal;
    }

    public void setPricetotal(String pricetotal) {
        this.pricetotal = pricetotal;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }


    public JSONObject toJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("receivername",receivername);
        jsonObject.put("address",address);
        jsonObject.put("phonenumber",phonenumber);
        jsonObject.put("createtime",createtime);
        jsonObject.put("pricetotal",pricetotal);
        return jsonObject;
    }
}
