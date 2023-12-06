package lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGT = 230;
    private static final int WINDOW_WIDTH = 350;
    JButton btnStart = new JButton("Start new game!");
    SettingsWindow(GameWindow gameWindow){
        setLocationRelativeTo(gameWindow);
        //setLocationRelativeTo(getX() - WINDOW_WIDTH/2, getY() - WINDOW_HEIGT/2);
        setSize(WINDOW_WIDTH, WINDOW_HEIGT);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0, 3, 3, 3);
                setVisible(false);
            }
        });
        add(btnStart);
    }
}
