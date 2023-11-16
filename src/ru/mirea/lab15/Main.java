package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Создание главного окна
        JFrame frame = new JFrame("Программа с меню");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели содержимого
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Создание текстового поля
        JTextArea textArea = new JTextArea();
        panel.add(textArea);

        // Создание кнопок
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        panel.add(button1);
        panel.add(button2);

        // Создание меню
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);
        menuBar.add(editMenu);

        JMenu helpMenu = new JMenu("Справка");
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        // Обработчик события нажатия кнопки 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                textArea.setText(text + "Нажата кнопка 1\n");
            }
        });

        // Обработчик события нажатия кнопки 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                textArea.setText(text + "Нажата кнопка 2\n");
            }
        });

        // Обработчик события выбора пункта меню "Сохранить"
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                // Здесь можно добавить код для сохранения текста в файл
                JOptionPane.showMessageDialog(frame, "Текст успешно сохранен!");
            }
        });

        // Обработчик события выбора пункта меню "Выйти"
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
