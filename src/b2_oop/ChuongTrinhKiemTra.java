/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhKiemTra {
    
    public static void main(String[] args) {
        HanhKhach[] dsHanhKhach = new HanhKhach[] {
            new HanhKhach("Phong", 38.0, 100.0, true),
            new HanhKhach("Tuấn", 37.0, 10.0, false),
            new HanhKhach("Trần", 37.0, 5.0, true)
        };
        
        CuaKiemTraCovid cuaMot = new CuaKiemTraCovid();
        CuaKiemTraHanhLy cuaHai = new CuaKiemTraHanhLy();
        
        for(HanhKhach hanhKhach : dsHanhKhach) {
            if (cuaMot.kiemTraThanNhiet(hanhKhach)) { // Nếu hợp lệ
                System.out.println("Thân nhiệt hợp lệ: " + hanhKhach.getTen());
            } else {
                System.out.println("Thân nhiệt không hợp lệ: " + hanhKhach.getTen());
                continue; // Đằng sau đi vào tiếp
            }
            
            if (cuaHai.kiemTraSoCan(hanhKhach)) { // Nếu hợp lệ
                System.out.println("Số cân hợp lệ: " + hanhKhach.getTen());
            } else {
                System.out.println("Số cân không hợp lệ: " + hanhKhach.getTen());
            }
        }
    }
}
