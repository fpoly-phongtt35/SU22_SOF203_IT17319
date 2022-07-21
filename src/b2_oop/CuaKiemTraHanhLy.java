/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraHanhLy {
    
    public boolean kiemTraSoCan(HanhKhach hanhKhach) {
        Double soCan = hanhKhach.getSoCanHanhLy();
        
        if (soCan > 0 && soCan < 20) {
            return true;
        } else {
            return false;
        }
    } 
}
