package com.test.collection;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>
{
    public int compare(Student o1, Student o2)
    {
        return (int) (o1.getId() - o2.getId());
    }
}
