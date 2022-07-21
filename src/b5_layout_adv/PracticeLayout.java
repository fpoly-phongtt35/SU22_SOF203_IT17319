/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_layout_adv;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author phongtt
 */
public class PracticeLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Đăng ký Học lại");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        
        JComboBox ccbSubject = new JComboBox();
        ccbSubject.addItem("Java");
        ccbSubject.addItem("C#");
        frame.add(ccbSubject);
        
        JCheckBox cbConfirm = new JCheckBox();
        cbConfirm.setText("Tôi đồng ý");
        frame.add(cbConfirm);
        
        JRadioButton rbMale = new JRadioButton();
        rbMale.setText("Nam");
        frame.add(rbMale);
        
        JRadioButton rbFemale = new JRadioButton();
        rbFemale.setText("Nữ");
        frame.add(rbFemale);
        
        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(rbFemale);
        bgGender.add(rbMale);
        
        frame.pack();
    }
}
