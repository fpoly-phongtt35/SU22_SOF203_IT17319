/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author phongtt
 */
public class PracticeFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Luyện tập FLOW LAYOUT");
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        
        JLabel txtMSSV = new JLabel("PhongTT35");
        
        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnRead = new JButton("Read");
        JButton btnExit = new JButton("Exit");
        
        frame.setLayout(layout);
        frame.add(txtMSSV);
        frame.add(btnAdd);
        frame.add(btnUpdate);
        frame.add(btnDelete);
        frame.add(btnRead);
        frame.add(btnExit);
        
        frame.pack();
        frame.setVisible(true);
    }
}
