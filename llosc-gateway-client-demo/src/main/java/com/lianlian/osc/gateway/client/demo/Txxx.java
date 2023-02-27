package com.lianlian.osc.gateway.client.demo;

import com.alibaba.fastjson.JSONObject;

public class Txxx {


    public static void main(String[] args) {
        System.out.println(JSONObject.toJSON(0));
        String x = "0";
        Integer xx = JSONObject.parseObject(x,Integer.class);
        System.out.println(xx);

    }


}
