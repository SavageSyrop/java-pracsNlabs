package lab5;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {

    protected int x;
    protected int y;
    protected int width;
    protected int heigth;
    protected int r;
    protected int g;
    protected int b;

    Shape()
    {
        Random rand = new Random();
        x = rand.nextInt(400);
        y = rand.nextInt(100);
        r = rand.nextInt(255);
        g = rand.nextInt(255);
        b = rand.nextInt(255);
        heigth = rand.nextInt(1000);
        width=rand.nextInt(1000);
    }





    public abstract void paint(Graphics g);





}
