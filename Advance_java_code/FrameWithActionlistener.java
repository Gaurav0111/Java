import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameWithActionlistener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action listener");
        JButton button = new JButton("Click");
        button.setBounds(50,50,100,30);
        frame.add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button1 = new JButton("Click Me");
                button1.setBounds(100,100,100,30);
                frame.add(button1);
            }
        });

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
