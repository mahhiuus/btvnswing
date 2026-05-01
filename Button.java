import javax.swing.*;
import java.awt.*;

public class Button extends JPanel {
    public Button() {
        setPreferredSize(new Dimension(100, 50));
        setBackground(Color.BLUE);
        setOpaque(true);
        setLayout(new BorderLayout());
        JButton btn = new JButton("Button");
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        btn.setVerticalAlignment(SwingConstants.CENTER);

        add(btn, BorderLayout.CENTER);
    }
}
