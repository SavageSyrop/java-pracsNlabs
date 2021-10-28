package prac5;

public class RecursiveFunctions {
    public void funcOne(int n)  //1
    {
        String row = new String();

        if (n==0)
            return;

        for (int i=n;i>0;i--)
        {
           row = row+n;
        }
        this.funcOne(n-1);
        System.out.print(row);


    }

    public void funcTwo(int n)  //2
    {
        if (n>1)
            funcTwo(n-1);

        System.out.print(n);


    }

    public void funcThree(int a, int b) //3
    {
        if (a==b)
        {
            System.out.println(a);
            return;
        }


            if(a<b)
            {
                System.out.print(a);
                this.funcThree(a+1,b);


            }


            if(a>b)
            {
                System.out.print(a);
                this.funcThree(a-1,b);

            }



    }


    public long funcFour(long n) //5
    {
        long sum=0;
        if (n>9)
        {
            sum=n%10 + funcFour(n/10);
        }
        else
        {
            sum = n;
        }
        return sum;
    }



    public void funcFive(int n) //14
    {

        System.out.print(n%10);
        n=n/10;
        if (n!=0)
        {
            funcFive(n);
        }
        else
        {
            return;
        }

    }


}
