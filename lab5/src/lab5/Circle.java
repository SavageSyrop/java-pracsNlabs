package lab5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circle extends Shape{



    Circle()
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

    Circle(int i)
    {
        Random rand = new Random();
        x = rand.nextInt(400);
        y = rand.nextInt(100);
        r = i;
        g = i;
        b = i;
        heigth = rand.nextInt(1000);
        width=rand.nextInt(1000);
    }

    public void paint(Graphics g)
    {
        Color clr = new Color(super.r,super.g,super.b);
        g.setColor(clr);
        g.drawOval(super.x,super.y,super.width,super.width);
        g.fillOval(super.x,super.y,super.width,super.width);
    }
}
