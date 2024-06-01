// package Advance_java_code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JButton button = new JButton("Click");
        JTextField textArea = new JTextField();
        textArea.setBounds(50, 100, 200, 30);
        textArea.setVisible(false);
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setVisible(true);
            }
        });
        frame.add(textArea);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
