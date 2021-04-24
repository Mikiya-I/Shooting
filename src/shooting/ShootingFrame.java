package shooting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShootingFrame extends JFrame {
    public ShootingPanel panel;

    public ShootingFrame(){

        panel = new ShootingPanel();

        this.add(panel);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                Shooting.loop = false;
            }
        });

        setDefaultCloseOperation(3);
        this.setTitle("shooting");
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

    }

}
