package com.linlin.shop.domain;


import net.sf.json.JSONObject;


public class Orderdetail {
    int id;
    String productname;
    String productnumber;
    String pricesubtotal;
    String receivername;
    String ordernumber;
    String payway;

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

    public String getPricesubtotal() {
        return pricesubtotal;
    }

    public void setPricesubtotal(String pricesubtotal) {
        this.pricesubtotal = pricesubtotal;
    }

    public String getreceivername() {
        return receivername;
    }

    public void setreceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

//    public JSONObject toJSONObject(){
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("id",id);
//        jsonObject.put("productname",productname);
//        jsonObject.put("productnumber",productnumber);
//        jsonObject.put("pricesubtotal",pricesubtotal);
//        jsonObject.put("receivername",receivername);
//        jsonObject.put("ordernumber}",ordernumber);
//        jsonObject.put("payway",payway);
//        return jsonObject;
//    }
}
