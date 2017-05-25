package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("哌拉");
        Matcher m=p.matcher("哌拉西林钠舒巴坦钠（4：1）");
        while(m.find()) {
//            System.out.println(m.group());
            System.out.println(m.start()+"abc"+m.end());
        }
    }
}
