import java.util.Random;

public class StudentProgrammer implements IStudent {
    private Double averageScore=0.0;
    private String name;
    Integer[] scoreArray= new Integer[10];

    StudentProgrammer()
    {
        name = "NoName";
        for (int i=0; i<10;i++)
        {

            scoreArray[i]=2+(int)(Math.random()*(4));
            averageScore+=scoreArray[i];
        }
        averageScore/=10;
    }

    StudentProgrammer(String name)
    {
        this.name = name;
        for (int i=0; i<10;i++)
        {
            Random rand = new Random();
            scoreArray[i]=2+(int)(Math.random()*(4));
            averageScore+=scoreArray[i];
        }
        averageScore/=10;

    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverageScore() {
        return averageScore;
    }


    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public void toProgramm()
    {
        System.out.println("System.out.println(System.out.println(Gold on my wrist, ya programmist))");
    }

    public void print()
    {
            System.out.println(name + " " + averageScore);

    }
}
