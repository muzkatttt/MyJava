package hwSem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGui extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private final JTextArea log = new JTextArea();
    private JList<String> jList = new JList<>();
    private final JPanel panelTop = new JPanel(new GridLayout(2, 3));
    private final JTextField textForIPAdress = new JTextField("127.0.0.1");
    private final JTextField textForPort = new JTextField("8189");
    private final JTextField textForLogin = new JTextField("my_login");
    private final JPasswordField textForPassword = new JPasswordField("123456");
    private final JButton btnLogin = new JButton("Login");
    private final JButton btnSend = new JButton("Send");
    private final JButton btnStart = new JButton("Старт");

    public ClientGui(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setTitle("Chat Client");

        panelTop.add(textForIPAdress);
        panelTop.add(textForPort);
        panelTop.add(btnLogin);
        panelTop.add(textForLogin);
        panelTop.add(textForPassword);

        // размещение панели сверху окна
        add(panelTop, BorderLayout.NORTH);

        // настройка видимости окна клиента
        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);
        setVisible(true);

        // настройка интерфейса участника чата
        JPanel chatPanel = new JPanel(new GridLayout(3, 1));
        JTextArea jTextAreaChat = new JTextArea();
        String[] arrayList = {"User_one", "User_two"};
        jList.setListData(arrayList);
        chatPanel.add(jTextAreaChat);
        chatPanel.add(jList);
        JTextField textForMessage = new JTextField("");
        chatPanel.add(textForMessage, BorderLayout.SOUTH);
        chatPanel.add(btnSend);
        add(chatPanel, BorderLayout.SOUTH);
        setResizable(false);

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jTextAreaChat, textForMessage);
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextAreaChat.setText("");
            }
        });

        sendMessage(jTextAreaChat, textForMessage);
    }

    private void sendMessage(JTextArea jTextAreaChat, JTextField textForMessage){
        jTextAreaChat.append(textForMessage.getText() + "\n");
        textForMessage.setText("");
        log.setEditable(false);
    }
}
