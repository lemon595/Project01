package com.test;

import java.util.ArrayList;

/**
 * @author lyj
 * @date 2018/7/23 - 18:45
 */
public class Hello {
    
     public void test1 (){
         System.out.println();
      }




    public static void main(String[] args) {

        String [] arr=new String[]{"aa","bb","cc","dd","ee"};



        for (String s : arr) {
            System.out.println("s = " + s);
        }


        ArrayList list=new ArrayList();

        list.add("a");
        list.add(123);
        list.add(456);
        list.add("sadf");
        list.add(123);
        list.add(123);


        for (Object o : list) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        if (list == null) {

        }


        if (list == null) {


        }

        if (list != null) {
            
        }

        if (list == null) {

        }

        if (list != null) {

        }


        





    }



}


