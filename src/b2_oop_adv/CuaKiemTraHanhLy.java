/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraHanhLy extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
        Double soCan = hanhKhach.getSoCanHanhLy();
        
        if (soCan > 0 && soCan < 20) {
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(hanhKhach);
            } else {
                return "Hợp lệ";
            }
        } else {
            return "Số cân không hợp lệ: " + hanhKhach.getTen();
        }
    }
    
}
