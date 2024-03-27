import javax.swing.*;
import java.awt.event.*;

public class MyMouseListener1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener");
        JButton button = new JButton("Click Here");
        button.setBounds(50,50,100,30);
        frame.add(button);

        button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse has been clicked");
            }
        });

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        
    }
}
