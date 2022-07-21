/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_layout_adv;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phongtt
 */
public class DemoLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Layout");
        frame.setVisible(true); // hiển thị frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt chương khi x
        frame.setLocationRelativeTo(null); // để frame giữa màn hình
        
        GridLayout gridLayout = new GridLayout(4, 1); // 4 dòng x 1 cột
        frame.setLayout(gridLayout);
        
        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER); // giữa
        FlowLayout leftLayout = new FlowLayout(FlowLayout.LEFT); // trái
        FlowLayout rightLayout = new FlowLayout(FlowLayout.RIGHT); // phải
        
        JPanel pnFirst = new JPanel(centerLayout);
        JPanel pnSecond = new JPanel(leftLayout);
        JPanel pnThird = new JPanel(leftLayout);
        JPanel pnFourth = new JPanel(rightLayout);
        
        JButton btnXoa = new JButton("Xoá");
        btnXoa.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Thực hiện Xoá");
        });
        
        pnFirst.add(new JLabel("PhongTT35"));
        pnSecond.add(new JButton("Xem"));
        pnSecond.add(new JButton("Thêm"));
        pnThird.add(new JButton("Sửa"));
        pnThird.add(btnXoa);
        pnFourth.add(new JButton("Thoát"));
        
        frame.add(pnFirst);
        frame.add(pnSecond);
        frame.add(pnThird);
        frame.add(pnFourth);
        
        frame.pack();
    }
}
