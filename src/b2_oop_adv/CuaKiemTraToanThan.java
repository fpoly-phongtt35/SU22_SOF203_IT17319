/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraToanThan extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
        if (hanhKhach.getCoVuKhi()) {
            return "Không được mang vũ khí: " + hanhKhach.getTen();
        } else {
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(hanhKhach);
            } else {
                return "Hợp lệ";
            }
        }
    }
    
}
