/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public abstract class CuaKiemTra {
    
    protected CuaKiemTra cuaTiepTheo;
    
    public abstract String kiemTra(HanhKhach hanhKhach);
    
    public CuaKiemTra setCuaTiepTheo(CuaKiemTra cuaKiemTra) {
        this.cuaTiepTheo = cuaKiemTra;
        return this;
    }
}
