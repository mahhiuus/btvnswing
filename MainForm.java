import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Bai tap ngay 16/04/2026");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
        pack();
        setLocationRelativeTo(null);
    }

    private void initUI() {
        Label lb = new Label();

        JPanel mainContainer = new JPanel();
        mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
        mainContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        lb.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainContainer.add(lb);
        mainContainer.add(Box.createVerticalStrut(20));

        JButton button1 = new JButton("Nút 1");
        JButton button2 = new JButton("Nút 2");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainContainer.add(button1);
        mainContainer.add(Box.createVerticalStrut(10));
        mainContainer.add(button2);

        add(mainContainer);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainForm().setVisible(true));
    }
}
