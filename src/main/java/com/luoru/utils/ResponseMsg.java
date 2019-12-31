package com.luoru.utils;

import java.util.HashMap;

public class ResponseMsg {

    //状态码
    private int httpStatus;
    //描述
    private String data;
    //返回的数据
    private HashMap<String,Object> httpHeads;

    public ResponseMsg(){
        this.httpHeads = new HashMap<>();
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void addHttpHeads(String key,Object value){
        this.httpHeads.put(key, value);
    }

    public void setHttpHeads(HashMap<String, Object> httpHeads) {
        this.httpHeads = httpHeads;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "httpStatus=" + httpStatus +
                ", data='" + data + '\'' +
                ", httpHeads=" + httpHeads +
                '}';
    }

}
