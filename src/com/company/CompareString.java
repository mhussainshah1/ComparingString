package com.company;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "a";
        String str3 = new String("a");

        System.out.println(str1==str2);         //true
        System.out.println(str1.equals(str2));  //true

        System.out.println(str1==str3);         //false
        System.out.println(str1.equals(str3));  //true

        StringBuilder strb1 = new StringBuilder("a");
        StringBuilder strb2 = new StringBuilder("a");
        StringBuilder strb3 = strb1;

        System.out.println(strb1 == strb2);        //false
        System.out.println(strb1.equals(strb2));    //false
    }
}
