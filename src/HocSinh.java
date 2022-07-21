/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phongtt
 */
public class HocSinh {
    
    private String maHocSinh;
    
    // Hàm khởi tạo
    public HocSinh() {
        
    }
    
    // Hàm khởi tạo có tham số
    public HocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }
    
    public void hoc() {
        System.out.println("Học tập suốt đời!");
    }
    
    public void traoDoi(HocSinh thangBenCanh) {
        String mssvThangBenCanh = thangBenCanh.maHocSinh;
        System.out.println("Đang trao đổi với " + mssvThangBenCanh);
    }
}
