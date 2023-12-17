package hwSem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ServerWindow extends JFrame {

    // region Поля
    private static final int POS_X = 500;
    private static final int POS_Y = 700;
    private static final int WIDTH = 400;
    private static final int WEIGTH = 300;
    private final JButton btnStart = new JButton("Старт");
    private final JButton btnStop = new JButton("Стоп");
    private boolean isServerWorking;
    ArrayList<ClientGui> clientGuiList;
    JTextArea log;

    // endregion

    // region Конструктор
    /**
     * ServerWindow() - конструктор класса
     */
    ServerWindow() {
        clientGuiList = new ArrayList<>();
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
        createPanel();
        setVisible(true);
    }

    // endregion

    // region Методы
    /**
     * Метод, добавляющий пользователя в список пользователей на сервере, если сервер работает
     * @param clientGui - участник чата
     * @return true - если участник чата добавлен в список участников
     */
    public boolean connectToUser(ClientGui clientGui){
        if (!isServerWorking){
            return false;
        }
        clientGuiList.add(clientGui);
        return true;
    }

    /**
     * Метод getLog() при обращении к нему возвращает
     * @return метод readLog()
     */
    public String getLog() {
        return readLog();
    }

    /**
     * Метод, отключающийпользователя от сервера
     * @param clientGui - экземпляр класса ClientGui
     */
    public void disconnectUser(ClientGui clientGui){
        clientGuiList.remove(clientGui);
        if (clientGui != null){
            clientGui.disconnectFromServer();
        }
    }

    /**
     * Метод, создающий сообщение от пользователя
     * @param text принимает строку в качестве параметра
     */
    public void createMessage(String text){
        if (!isServerWorking){
            return;
        }
        text += "";
        appendLog(text);
        answerAll(text);
        saveInLog(text);
    }

    /**
     * Метод, отправляющий ответ всем зарегистрированным пользователям чата
     * @param text принимает строку в качестве параметра
     */
    private void answerAll(String text){
        for (ClientGui clientGui: clientGuiList){
            clientGui.answer(text);
        }
    }

    /**
     * Метод, который сохраняет логи в текстовый файл log.txt
     * @param text принимает строку в качестве параметра
     */
    private void saveInLog(String text){
        try (FileWriter writer = new FileWriter("log.txt", true)){
            writer.write(text);
            writer.write("\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Метод, считывающий логи из текстового файла log.txt
     * @return stringBuilder.toString() в случае успешного прочтения файла
     * или null в случае отсутствия файла в папке с проектом
     */
    private String readLog(){
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader("log.txt")){
            int c;
            while ((c = reader.read()) != -1){
                stringBuilder.append((char) c);
            }
            stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
            return stringBuilder.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Метод добавления текста в лог-файл
     * @param text
     */
    private void appendLog(String text){
        log.append(text + "\n");
    }

    /**
     * Метод создания панели с кнопками
     */
    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    /**
     * Метод добавления кнопок "Старт" и "Стоп" на панель управления
     * @return panel
     */
    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking){
                    appendLog("Сервер уже запущен");
                } else {
                    isServerWorking = true;
                    appendLog("Сервер запущен!");
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking){
                    appendLog("Сервер уже остановлен");
                } else {
                    isServerWorking = false;
                    for (ClientGui clientGui: clientGuiList){
                        disconnectUser(clientGui);
                    }
                    appendLog("Сервер остановлен!");
                }
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }
    // endregion
}