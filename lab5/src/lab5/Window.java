package lab5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {

    Window()
    {
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout gl = new GridLayout(16, 16);
        setLayout(gl);
        for(int k = 0; k < 256; ++k) {

            add(new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        Random rand = new Random();
                        int figure = rand.nextInt(3);


                        for (int i = 0; i < 255; i++) {
                            switch (figure) {
                                case 0:
                                    Shape circ = new Circle();
                                    circ.paint(g);
                                    break;
                                case 1:
                                    Shape rct = new Rectangle();
                                    rct.paint(g);
                                    break;
                                case 2:

                                    Shape ov = new Oval();
                                    ov.paint(g);
                                    break;
                            }

                            figure = rand.nextInt(3);
                        }
                    }
                }

            );
        }

        setVisible(true);

    }

    public static void main(String[] args) {

             Window wind = new Window();


    }


}
