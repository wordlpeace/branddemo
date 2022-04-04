package com.itheima.web.servlet.json;

import com.alibaba.fastjson.JSON;

public class demo {
    public static void main(String[] args) {
        //将java对象换成字符串
        user user1=new user();
        user1.setId(1);
        user1.setUsername("zhangsan");
        user1.setPassword("123");
        String s = JSON.toJSONString(user1);
        System.out.println(s);
        //将json字符串专成java对象
        user user = JSON.parseObject("{\"id\":1,\"password\":\"123\",\"username\":\"zhangsan\"}", user.class);
        String s1 = user.toString();
        System.out.println(s1);
    }
}
