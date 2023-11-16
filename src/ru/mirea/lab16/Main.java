package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Создание главного окна
        JFrame frame = new JFrame("Программа с меню выбора");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели содержимого
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Создание текстового поля
        JTextArea textArea = new JTextArea();
        panel.add(textArea, BorderLayout.CENTER);

        // Создание меню выбора цвета
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueMenuItem = new JMenuItem("Синий");
        JMenuItem redMenuItem = new JMenuItem("Красный");
        JMenuItem blackMenuItem = new JMenuItem("Черный");
        colorMenu.add(blueMenuItem);
        colorMenu.add(redMenuItem);
        colorMenu.add(blackMenuItem);

        // Создание меню выбора шрифта
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanMenuItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifMenuItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewMenuItem = new JMenuItem("Courier New");
        fontMenu.add(timesNewRomanMenuItem);
        fontMenu.add(msSansSerifMenuItem);
        fontMenu.add(courierNewMenuItem);

        // Создание меню
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);

        // Обработчик события выбора пункта меню цвета
        ActionListener colorMenuItemListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String color = menuItem.getText();

                switch (color) {
                    case "Синий":
                        textArea.setForeground(Color.BLUE);
                        break;
                    case "Красный":
                        textArea.setForeground(Color.RED);
                        break;
                    case "Черный":
                        textArea.setForeground(Color.BLACK);
                        break;
                }
            }
        };

        // Привязываем обработчик события к пунктам меню цвета
        blueMenuItem.addActionListener(colorMenuItemListener);
        redMenuItem.addActionListener(colorMenuItemListener);
        blackMenuItem.addActionListener(colorMenuItemListener);

        // Обработчик события выбора пункта меню шрифта
        ActionListener fontMenuItemListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { JMenuItem menuItem = (JMenuItem) e.getSource();
                String font = menuItem.getText();

                switch (font) {
                    case "Times New Roman":
                        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        break;
                    case "MS Sans Serif":
                        textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
                        break;
                    case "Courier New":
                        textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
                        break;
                }
            }
        };

        // Привязываем обработчик события к пунктам меню шрифта
        timesNewRomanMenuItem.addActionListener(fontMenuItemListener);
        msSansSerifMenuItem.addActionListener(fontMenuItemListener);
        courierNewMenuItem.addActionListener(fontMenuItemListener);

        // Добавляем панель на главное окно и задаем размеры окна
        frame.getContentPane().add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
