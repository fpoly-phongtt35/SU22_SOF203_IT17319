/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author phongtt
 */
public class DemoFlowLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 200); // kích cỡ
        frame.setVisible(true); // để chế độ hiển thị
        frame.setLocationRelativeTo(null);
        
        // tạo layout
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        frame.setLayout(flowLayout);
        
        JButton btnExit = new JButton(); // tạo nút thoát
        btnExit.setText("Ấn vào đây để thoát");
        btnExit.setSize(200, 50);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JButton btnHello = new JButton("Hello");
        btnHello.setSize(100, 50);
                
        frame.add(btnExit);
        frame.add(btnHello);
    }
}
