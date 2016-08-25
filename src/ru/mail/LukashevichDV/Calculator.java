package ru.mail.LukashevichDV;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Calculator {

    private JFrame frame;
    private JTextField display;
    private JPanel panel;
    private JPanel panelNumbers;

    double firstNumber;
    double secondNumber;
    double result;
    String operation;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Calculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Simple calculator");
        frame.setBounds(610, 280, 440, 390);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        //<--------------------------------------- display ------------------------------------------>

        display = new JTextField();
        display.setBackground(Color.BLACK);
        display.setFont(new Font("Tahoma", Font.BOLD, 35));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(display, BorderLayout.NORTH);

        panelNumbers = new JPanel();
        panelNumbers.setLayout(new GridLayout(5, 4, 1, 1));
        panelNumbers.setBackground(Color.BLACK);

        //<--------------------------------------- row # 1 ------------------------------------------->

        JButton btnSQRT = new JButton("\u221A");
        btnStyleFunctions(btnSQRT);
        btnSQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (Double.parseDouble(display.getText()) > 0) {
                        result = Math.sqrt(Double.parseDouble(display.getText()));
                        display.setText(Double.toString(result));
                    } else {
                        display.setBackground(Color.orange);
                        display.setText("Format input illegal ! ");
                    }
                } catch (NumberFormatException e1) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnSQRT);

        JButton btnClear = new JButton("C");
        btnStyleFunctions(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setBackground(Color.BLACK);
                display.setText(null);
            }
        });
        panelNumbers.add(btnClear);

        JButton btnBackspace = new JButton("\uF0E7");
        btnStyleFunctions(btnBackspace);
        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (display.getText().length() > 0) {
                    StringBuilder stb = new StringBuilder(display.getText());
                    stb.deleteCharAt(display.getText().length() - 1);
                    backspace = stb.toString();
                    display.setText(backspace);
                }
            }
        });
        btnBackspace.setFont(new Font("Windings", Font.BOLD, 20));
        btnBackspace.setBackground(Color.LIGHT_GRAY);
        panelNumbers.add(btnBackspace);

        JButton btnDivide = new JButton("\u00F7");
        btnStyleFunctions(btnDivide);
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "/";

                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnDivide);

        //<--------------------------------------- row # 2 ------------------------------------------->

        JButton btn7 = new JButton("7");
        btnStyleNumbers(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn7.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn7);

        JButton btn8 = new JButton("8");
        btnStyleNumbers(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn8.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn8);

        JButton btn9 = new JButton("9");
        btnStyleNumbers(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn9.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn9);

        JButton btnMultiply = new JButton("\u00D7");
        btnStyleFunctions(btnMultiply);
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "*";
                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnMultiply);

        //<--------------------------------------- row # 3 ------------------------------------------->

        JButton btn4 = new JButton("4");
        btnStyleNumbers(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn4.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn4);

        JButton btn5 = new JButton("5");
        btnStyleNumbers(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn5.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn5);

        JButton btn6 = new JButton("6");
        btnStyleNumbers(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn6.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn6);

        JButton btnMinus = new JButton("\u2212");
        btnStyleFunctions(btnMinus);
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "-";
                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnMinus);

        //<--------------------------------------- row # 4 ------------------------------------------->

        JButton btn1 = new JButton("1");
        btnStyleNumbers(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn1.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn1);

        JButton btn2 = new JButton("2");
        btnStyleNumbers(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn2.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn2);

        JButton btn3 = new JButton("3");
        btnStyleNumbers(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn3.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn3);

        JButton btnPlus = new JButton("+");
        btnStyleFunctions(btnPlus);
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    firstNumber = Double.parseDouble(display.getText());
                    display.setText("");
                    operation = "+";
                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnPlus);

        //<--------------------------------------- row # 5 ------------------------------------------->

        JButton btnPlusMinus = new JButton("\u00B1");
        btnPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(display.getText());
                    value = value * -1;
                    display.setText(Double.toString(value));
                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        btnPlusMinus.setFont(new Font("Windings", Font.BOLD, 20));
        btnPlusMinus.setBackground(Color.white);
        panelNumbers.add(btnPlusMinus);

        JButton btn0 = new JButton("0");
        btnStyleNumbers(btn0);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btn0.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btn0);

        JButton btnDot = new JButton(".");
        btnStyleNumbers(btnDot);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNumber = display.getText() + btnDot.getText();
                display.setText(enterNumber);
            }
        });
        panelNumbers.add(btnDot);

        JButton btnResult = new JButton("=");
        btnStyleFunctions(btnResult);
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    secondNumber = Double.parseDouble(display.getText());
                    if (operation == "+") {
                        result = firstNumber + secondNumber;
                        display.setText(Double.toString(result));
                    } else if (operation == "-") {
                        result = firstNumber - secondNumber;
                        display.setText(Double.toString(result));
                    } else if (operation == "/") {
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                            display.setText(Double.toString(result));
                        } else {
                            display.setBackground(Color.red);
                            display.setText("Oops! Division by zero ");
                        }
                    } else if (operation == "*") {
                        result = firstNumber * secondNumber;
                        display.setText(Double.toString(result));
                    }
                } catch (NumberFormatException e2) {
                    display.setBackground(Color.orange);
                    display.setText("Format input illegal ! ");
                }
            }
        });
        panelNumbers.add(btnResult);

        frame.getContentPane().add(panelNumbers, BorderLayout.CENTER);
    }

    public void btnStyleNumbers(JButton button) {
        button.setFont(new Font("Tahoma", Font.BOLD, 20));
        button.setBackground(Color.white);
    }

    public void btnStyleFunctions(JButton button) {
        button.setFont(new Font("Tahoma", Font.BOLD, 20));
        button.setBackground(Color.LIGHT_GRAY);
    }

}