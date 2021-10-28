package lab5;

import javax.sound.sampled.ReverbType;
import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape{


    Rectangle()
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


    Rectangle(int i)
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
        g.drawRect(super.x,super.y,super.width,super.heigth);
        g.fillRect(super.x,super.y,super.width,super.heigth);
    }
}
