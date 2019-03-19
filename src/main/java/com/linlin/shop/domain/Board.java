package com.linlin.shop.domain;

import net.sf.json.JSONObject;

//@Data
//@EqualsAndHashCode(callSuper = false)
//@NoArgsConstructor
public class Blank {

    private int id;
    private String blank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public JSONObject toJSONObject(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("blank",blank);
        return jsonObject;
    }
}
