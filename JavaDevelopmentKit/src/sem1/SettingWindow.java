package sem1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    JButton btnStart;
    JRadioButton humanVH, humanVAi;
    JSlider fieldSizeSlider, winLengthSlider;
    JLabel labelFieldSize, labelWinLength;
    GameWindow gameWindow;

    SettingWindow(GameWindow gameWindow){
        this.gameWindow = gameWindow;

        btnStart = new JButton("Start new game");

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                int mode = humanVAi.isSelected() ? 1 : 0;
                gameWindow.startNewGame(mode, fieldSizeSlider.getValue(), fieldSizeSlider.getValue(), winLengthSlider.getValue());
            }
        });

        add(createSettingPanel());

        add(btnStart, BorderLayout.SOUTH);
    }
    private Component createModePanel(){
        JPanel jPanel = new JPanel(new GridLayout(3, 1));
        humanVH = new JRadioButton("Игрок против игрока");
        humanVAi = new JRadioButton("Игрок против компьютера");
        JLabel jLabel = new JLabel("Выберите режим игры");
        ButtonGroup modeGroup = new ButtonGroup();
        modeGroup.add(humanVH);
        modeGroup.add(humanVAi);
        jPanel.add(jLabel);
        jPanel.add(humanVH);
        jPanel.add(humanVAi);
        humanVAi.setSelected(true);
        return jPanel;
    }

    private Component createSizePanel(){
        JPanel jPanel = new JPanel(new GridLayout(3, 1));
        fieldSizeSlider = new JSlider(3, 10, 3);
        labelFieldSize = new JLabel();
        JLabel jLabel = new JLabel("Выберите размер поля");
        jPanel.add(jLabel);
        jPanel.add(labelFieldSize);
        jPanel.add(fieldSizeSlider);

        fieldSizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelFieldSize.setText("Установленный размер поля: " + fieldSizeSlider.getValue());

            }
        });
        return jPanel;
    }
    private Component createWinLengthPanel(){
        JPanel jPanel = new JPanel(new GridLayout(3, 1));
//        JSlider fieldSizeSlider, winLengthSlider;
//        JLabel labelFieldSize, labelWinLength;
        winLengthSlider = new JSlider(3, 10, 3);
        labelWinLength = new JLabel();
        JLabel jLabel = new JLabel("Выберите длину поля выигрыша");
        jPanel.add(jLabel);
        jPanel.add(labelWinLength);
        jPanel.add(winLengthSlider);

        winLengthSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText("Установленный размер поля: " + fieldSizeSlider.getValue());

            }
        });
        return jPanel;
    }
    private Component createSettingPanel(){
        JPanel settingPanel = new JPanel(new GridLayout(3, 1));
        settingPanel.add(createModePanel());
        settingPanel.add(createSizePanel());
        settingPanel.add(createWinLengthPanel());
        //settingPanel.add(createSettingPanel());
        return settingPanel;
    }
}
