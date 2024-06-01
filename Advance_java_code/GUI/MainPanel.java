import javax.swing.*;

public class MainPanel extends JPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Main Panel Example");
            JButton button = new JButton("Click me");
            button.setBounds(0,0,20,30);
            frame.add(button);
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setVisible(true);
        });
    }
}
