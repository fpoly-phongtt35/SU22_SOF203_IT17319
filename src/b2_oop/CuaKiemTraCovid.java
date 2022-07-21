/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraCovid {
    
    public boolean kiemTraThanNhiet(HanhKhach hanhKhach) {
        // Lấy số đo thân nhiệt của hành khách
        double thanNhiet = hanhKhach.getThanNhiet();
        
        // Kiểm tra thân nhiệt hợp lệ
        if (thanNhiet > 36.5 && thanNhiet < 37.5) {
            return true; // Hợp lệ
        } else {
            return false; // Không hợp lệ
        }
    }
}
