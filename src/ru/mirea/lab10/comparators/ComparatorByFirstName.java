package ru.mirea.lab10.comparators;
import ru.mirea.lab10.Student;
import java.util.Comparator;

public class ComparatorByFirstName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
