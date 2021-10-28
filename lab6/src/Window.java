import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Window extends JFrame {
    JTextField tField = new JTextField(100);
    JButton submit = new JButton("Submit");
    JLabel rules = new JLabel();
    JLabel info = new JLabel("Ожидание ввода");
    JLabel attLeft = new JLabel();
    int guess = 0;
    int attempt=0;
    int count=0;


    Window()
    {
        super("lab6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        tField.setBackground(new Color(228,255,255));
        submit.setBackground(new Color(255, 67, 255));
        info.setForeground(new Color(21, 249, 34));
        attLeft.setForeground(new Color(100,255,100));

        pack();
        setSize(600,300);
        rules.setText("<html>Необходимо с 3 попыток угадать число от 0 до 20, число загадывается случайно.<br> После неудачной попытки появляется информация о том, было ли введенное число больше или меньше загаданного!<br>Удачи!</html>");
        attLeft.setText("Осталось попыток " + (3-count));

        tField.setBounds(250,60,100,60);
        submit.setBounds(255,140,90,30);
        info.setBounds(20,90,120,80);
        rules.setBounds(2,10,600,60);
        attLeft.setBounds(20,80,130,50);

        add(tField);
        add(submit);
        add(info);
        add(rules);
        add(attLeft);

        Random rand = new Random();
        guess = rand.nextInt(20);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempt = Integer.parseInt(tField.getText());
                count++;
                if (attempt==guess)
                {
                    info.setBackground(new Color(0, 255, 255));
                    info.setText("Вы угадали!");
                    submit.setEnabled(false);

                }
                else if (attempt>guess)
                {
                    info.setBackground(new Color(10, 10, 255));
                    info.setText("Меньше!");
                    attLeft.setForeground(new Color(80*(count),50*(3-count),0));
                    attLeft.setText("Осталось попыток " + (3-count));
                    tField.setText("");
                }
                else
                {
                    info.setBackground(new Color(255, 10, 10));
                    info.setText("Больше!");
                    attLeft.setForeground(new Color(80*(count),50*(3-count),0));
                    attLeft.setText("Осталось попыток " + (3-count));
                    tField.setText("");
                }

                if (count>2)
                {
                    info.setBackground(new Color(0, 0, 0));
                    info.setText("К сожалению, вы не угадали :(");
                    attLeft.setText("Осталось попыток " + (3-count));
                    tField.setEnabled(false);
                    submit.setEnabled(false);


                }

            }
        });





        setVisible(true);
    }

}
