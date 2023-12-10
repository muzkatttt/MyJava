package hwSem1;

import javax.swing.*;
import java.awt.*;

public class ClientGui extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JTextArea log = new JTextArea();

    private final JPanel panelTop = new JPanel(new GridLayout(2, 3));
    private final JTextField textForIPAdress = new JTextField("127.0.0.1");
    private final JTextField textForPort = new JTextField("8189");
    private final JTextField textForLogin = new JTextField("my_login");
    private final JPasswordField textForPassword = new JPasswordField("123456");
    private final JButton btnLogin = new JButton("Login");
    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JTextField textForMessage = new JTextField();
    private final JButton btnSend = new JButton("Send");

    public ClientGui(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setTitle("Chat Client");

        panelTop.add(textForIPAdress);
        panelTop.add(textForPort);
        panelTop.add(textForLogin);
        panelTop.add(textForPassword);
        panelTop.add(btnLogin);
        add(panelTop, BorderLayout.NORTH);

        panelBottom.add(textForMessage, BorderLayout.CENTER);
        panelBottom.add(btnSend, BorderLayout.EAST);
        add(panelBottom, BorderLayout.SOUTH);

        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);
        setVisible(true);


    }
}
