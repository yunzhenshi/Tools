package com.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by android on 2017/5/23.
 */

public class TripZero {
    public static void main(String[] args){
        String number = "12.00";

//        System.out.println(number);                         //12.0
//
//        System.out.println(Double.toString(number));        //12.0

//        DecimalFormat df = new DecimalFormat(number);
//
//        DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
//        System.out.println(decimalFormat.format(df));   //12

        System.out.println(Fen2Yuan_("10000.45"));

        System.out.println(isBig("36", "42"));

    }

    public static String Fen2Yuan_(String fen) {
        String str;
        try {
            if (fen == null || fen.isEmpty()) {
                return "0";
            }
            DecimalFormat df = new DecimalFormat("######.##");
            BigDecimal fenNum = new BigDecimal(fen);
            BigDecimal big2 = new BigDecimal("100");
            BigDecimal divide = fenNum.divide(big2);
            str = String.valueOf(df.format(divide));
        } catch (Exception e) {
            return "0";
        }
        return str;
    }

    public static void Fen2Yuan(String fen) {

            DecimalFormat df = new DecimalFormat("0.##");
            BigDecimal fenNum = new BigDecimal("0");
            BigDecimal big2 = new BigDecimal("100");
            BigDecimal divide = fenNum.divide(big2);

    }

    /**
     *
     * @param standard 标准
     * @param value 要比较的值
     * @return true 大于
     *          false 小于
     */
    public static boolean isBig(String standard, String value) {
        BigDecimal standardb = new BigDecimal(standard);
        BigDecimal valueb = new BigDecimal(value);
        int i = valueb.compareTo(standardb);
        if (i >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
