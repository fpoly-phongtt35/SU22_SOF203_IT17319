/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraCovid extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
       // Lấy số đo thân nhiệt của hành khách
        double thanNhiet = hanhKhach.getThanNhiet();
        
        // Kiểm tra thân nhiệt hợp lệ
        if (thanNhiet > 36.5 && thanNhiet < 37.5) {
            // Cho cửa tiếp theo kiểm tra tiếp
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(hanhKhach);
            } else {
                return "Hợp lệ";
            }
        } else { // Không hợp lệ
            return "Thân nhiệt không hợp lệ: " + hanhKhach.getTen();
        }
    }
    
}
