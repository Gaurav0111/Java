import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(4, 3)); // 3 rows, 3 columns

        // Adding buttons directly to the frame
        for (int i = 1; i <= 19; i++) {
            JButton button = new JButton(""+i);
            frame.add(button);
        }

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
