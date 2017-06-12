package com.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by android on 2017/5/25.
 */

public class Format {
    public static void main(String[] args) {
        System.out.println(formatMoneyData("3.", "#.#"));
    }
    public static String formatMoneyData(String totalNumber, String format) {
        DecimalFormat df = new DecimalFormat(format);
        try {
            BigDecimal yuanNum = new BigDecimal(totalNumber);
            return df.format(yuanNum);
        } catch (Exception e) {
            return "";
        }
    }
}
