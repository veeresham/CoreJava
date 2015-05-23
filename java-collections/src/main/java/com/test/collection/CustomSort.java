package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSort
{

    public static void main(String[] args)
    {
        sortOne();
        sortTwo();
    }

    private static void sortOne()
    {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(10));
        list.add(new Person(2));
        list.add(new Person(15));

        System.out.println("Elements before sorting : ");
        for (Person i : list)
            System.out.print(" " + i.getId());
        Collections.sort(list);
        System.out.println("\nElements after sorting : ");
        for (Person i : list)
            System.out.print(" " + i.getId());

    }

    private static void sortTwo()
    {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(10));
        list.add(new Student(2));
        list.add(new Student(15));

        System.out.println("Elements before sorting : ");
        for (Student i : list)
            System.out.print(" " + i.getId());
        Collections.sort(list, new StudentComparator());
        System.out.println("\nElements after sorting : ");
        for (Student i : list)
            System.out.print(" " + i.getId());

    }

}
