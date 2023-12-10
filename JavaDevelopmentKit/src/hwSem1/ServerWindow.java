package hwSem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 700;
    private static final int WIDTH = 400;
    private static final int WEIGTH = 300;

    private final JButton btnStart = new JButton("Старт");
    private final JButton btnStop = new JButton("Стоп");

    private final JTextArea log = new JTextArea();

    private boolean isServerWorking;


//    public static void main(String[] args){
//        new ServerWindow();
//    }

    ServerWindow() {
        isServerWorking = false;
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = false;
                System.out.println("Сервер остановлен " + isServerWorking + "\n");
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                System.out.println("Сервер начал работу " + isServerWorking + "\n");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, WEIGTH);
        setResizable(false);
        setTitle("Чат");
        setAlwaysOnTop(true);
        setLayout(new GridLayout(1, 2));
        add(btnStart);
        add(btnStop);

        setVisible(true);
    }
}
