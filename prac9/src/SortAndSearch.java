public class SortAndSearch {
    SortAndSearch()
    {

    }

    void sort(IStudent[] array)
    {
        for (int i =0;i< array.length;i++)
        {
            Double current = array[i].getAverageScore();
            String currentName =array[i].getName();
            int j=i;
            while (j>0 && array[j-1].getAverageScore()>current)
            {
                array[j].setAverageScore(array[j-1].getAverageScore());
                array[j].setName(array[j-1].getName());
                j--;
            }
            array[j].setAverageScore(current);
            array[j].setName(currentName);
        }
    }


    IStudent search(IStudent[] array, String key)
    {
        for(int i =0;i<=array.length;i++)
        {
            if (array[i].getName()==key)
            {
                System.out.println("Элемент найден");
                return (array[i]);
            }
        }
        return null;
    }

    void printFull(IStudent[] array)
    {
        for (int i=0; i<5; i++)
        {
            array[i].print();
        }
    }


}
