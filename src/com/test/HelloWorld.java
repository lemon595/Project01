package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class HelloWorld {


    private static int num;





    public static void main(String[] args) {
        System.out.println("helloworld");


        String name = "";
        HashMap<String, String> mapper = getStringStringHashMap();


        System.out.println(mapper.get("str"));


        Date date = new Date();


        ArrayList list=new ArrayList();

        System.out.println("args = [" + args + "]");

        System.out.println("HelloWorld.main");


        System.out.println("list = " + list);
        System.out.println("date = " + date);
        System.out.println("name = " + name);

        System.out.println(mapper);




    }

    private static HashMap<String, String> getStringStringHashMap() {
        HashMap<String, String> mapper = new HashMap<>();
        mapper.put("str", "str");
        mapper.put("ss", "ss");
        mapper.put("ss", "ss");
        mapper.put("ss", "ss");
        return mapper;
    }


    public static void method() {

        num = 10;


        try {
            FileInputStream fileInputStream=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
