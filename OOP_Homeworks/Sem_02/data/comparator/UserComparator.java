package Sem_02.data.comparator;

import Sem_02.data.Student;
import Sem_02.service.DataService;

import java.util.Comparator;

public class UserComparator implements  Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
         return student1.getName().compareTo(student2.getName());
    }

    public int compareName(Student student1, Student student2) {
        return (student1.getName().compareTo(student2.getName()));
    }

}
