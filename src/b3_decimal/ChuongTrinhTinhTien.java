/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3_decimal;

import java.math.BigDecimal;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhTinhTien {
    
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        
        System.out.println(c);
        
        String input = "400000";
        double inputDou = Double.parseDouble(input);
        BigDecimal inputBD = BigDecimal.valueOf(inputDou);
        
        BigDecimal aa = BigDecimal.valueOf(0.2);
        BigDecimal bb = BigDecimal.valueOf(0.1);
        BigDecimal cc = aa.add(bb);
        aa.subtract(bb); // trừ
        aa.divide(bb); // chia
        aa.multiply(bb); // nhân
        System.out.println(cc);
    }
}
