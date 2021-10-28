package prac6;

import java.util.Random;

public class mainClass {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            System.out.print(students[i].getId()+" ");
        }
        System.out.println();
        Sort sort = new Sort();
        sort.insertionSort(students);
        for (int i=0;i<10;i++)
            System.out.print(students[i].getId()+" ");

    }
}
