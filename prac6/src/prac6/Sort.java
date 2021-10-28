package prac6;

public class Sort {
    public void insertionSort(Student [] students)
    {
        for (int i =0;i< students.length;i++)
        {
            int current = students[i].getId();
            int j=i;
            while (j>0 && students[j-1].getId()>current)
            {
                students[j].setId(students[j-1].getId());
                j--;
            }
            students[j].setId(current);
        }
    }
}
