package jack.net.cookieclicker;

import javax.swing.*;
import java.awt.*;

public class CookieFrame {

    private int clicked = 0;
    boolean dcunlcoked = false;

    public void cookieClicker() {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(750, 750);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setBounds(250, 250, 750, 750);

        ImageIcon icon = new ImageIcon("src/cookieclicker.png");
        JButton button = new JButton();
        button.setIcon(icon);
        button.setBounds(170, 170, 350, 350);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setBorder(null);

        JLabel label = new JLabel("Number of clicks: " + clicked);
        label.setFont(new Font("Sitka Text", Font.BOLD, 13));
        label.setBounds(10, 11, 150, 30);

        JLabel label2 = new JLabel("Double clicker: " + dcunlcoked);
        label2.setFont(new Font("Sitka Text", Font.BOLD, 13));
        label2.setBounds(100, 25, 150, 30);
        jFrame.add(label2);

        jFrame.add(label);
        jFrame.add(button);

        button.addActionListener(e -> {
            clicked++;
            label.setText("Number of clicks: " + clicked);

            if (clicked >= 25) {
                clicked++;
                dcunlcoked = true;
                label.setText("Number of clicks: " + clicked);
                label2.setText("Double clicker: " + dcunlcoked);

            }
        });
    }
}
