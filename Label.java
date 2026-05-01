import javax.swing.*;
import java.awt.*;

public class Label extends JPanel {
    public Label() {
        setPreferredSize(new Dimension(100, 50));
        setBackground(Color.WHITE);
        setOpaque(true);
        setLayout(new BorderLayout());

        JLabel lb = new JLabel("Hello World");
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setVerticalAlignment(SwingConstants.CENTER);

        add(lb, BorderLayout.CENTER);
    }
}
