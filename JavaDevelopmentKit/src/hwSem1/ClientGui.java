package hwSem1;

import sem2.client.Client;
import sem2.client.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientGui extends JFrame {

    // region Поля
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private JTextArea log = new JTextArea();
    private final JPanel panelTop = new JPanel(new GridLayout(2, 3));
    private final JPanel panelFooter = new JPanel(new BorderLayout());
    private final JTextField textForIPAdress = new JTextField("127.0.0.1");
    private final JTextField textForPort = new JTextField("8189");
    private final JTextField textForLogin = new JTextField("my_login");
    private final JTextField textForMessage = new JTextField();
    private final JPasswordField textForPassword = new JPasswordField("123456");
    private final JButton btnLogin = new JButton("Login");
    private final JButton btnSend = new JButton("Send");
    private ServerWindow serverWindow;
    private String name;
    private boolean isConnected;

    // endregion

    // region Конструктор
    public ClientGui(ServerWindow serverWindow) {
        this.serverWindow = serverWindow;
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat client");
        setLocation(serverWindow.getX() - 500, serverWindow.getY());

        createPanel();

        setVisible(true);
    }

    // endregion

    // region Методы

    /**
     * Метод, логирующий сообщение от пользователя (ответ)
     * @param text
     */
    public void answer(String text) {
        appendLog(text);
    }

    /**
     * Метод, соединяющий пользователя с сервером
     */
    private void connectToServer() {
        if (serverWindow.connectToUser(this)) {
            appendLog("Вы успешно подключились!\n");
            panelTop.setVisible(false);
            isConnected = true;
            name = textForLogin.getText();
            String log = serverWindow.getLog();
            if (log != null) {
                appendLog(log);
            }
        } else {
            appendLog("Не удалось подключиться к серверу");
        }
    }

    /**
     * Метод, отключащий пользователя от сервера
     */
    public void disconnectFromServer() {
        if (isConnected) {
            panelTop.setVisible(true);
            isConnected = false;
            serverWindow.disconnectUser(this);
            appendLog("Вы были отключены от сервера");
        }
    }

    /**
     * Метод, отправляющий сообщение от пользователя в чат
     */
    public void sendMessage() {
        if (isConnected) {
            String text = textForMessage.getText();
            if (!text.equals("")) {
                serverWindow.createMessage(name + ": " + text);
                textForMessage.setText("");
                log.setEditable(false);
                btnSend.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage();
                    }
                });
            }
        } else {
            appendLog("Нет подключения к серверу");
        }
    }

    /**
     * Метод, добавляющий логи в JTextArea log
     * @param text
     */
    private void appendLog(String text){
        log.append(text + "\n");
    }

    /**
     * Метод, создающий панель управления чатом
     */
    private void createPanel() {
        add(createPanelTop(), BorderLayout.NORTH);
        add(createLog());
        add(createFooter(), BorderLayout.SOUTH);
    }

    /**
     * Метод, создающий верхнюю панель чата
     * @return panelTop
     */
    private Component createPanelTop(){
        JPanel panelTop = new JPanel(new GridLayout(2, 3));
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectToServer();
            }
        });

        panelTop.add(textForIPAdress);
        panelTop.add(textForPort);
        panelTop.add(new JPanel());
        panelTop.add(textForLogin);
        panelTop.add(textForPassword);
        panelTop.add(btnLogin);

        return panelTop;
    }

    /**
     * Метод, создающий прокручивающуюся панель в чате
     * @return JScrollPane(log)
     */
    private Component createLog(){
        log.setEditable(false);
        return new JScrollPane(log);
    }

    /**
     * Метод, создающий нижнюю панель управления (подвал)
     * @return panelFooter
     */
    private Component createFooter() {
        textForMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    sendMessage();
                }
            }
        });
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        panelFooter.add(textForMessage);
        panelFooter.add(btnSend, BorderLayout.EAST);
        return panelFooter;
    }

    /**
     * Метод, разъединяющий соединение с сервером в случае нажатия пользователем на крестик на верхней панели
     * @return super.getDefaultCloseOperation()
     */
    @Override
    public int getDefaultCloseOperation() {
        disconnectFromServer();
        return super.getDefaultCloseOperation();
    }

    // endregion
}
