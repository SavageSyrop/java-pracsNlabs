package prac6;

import java.util.Random;

public class Student {
    public int id;
    Student()
    {
        Random rand = new Random();
        this.id=rand.nextInt(54);
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id=id;
    }


}
