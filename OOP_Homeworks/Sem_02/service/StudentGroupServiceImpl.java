package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.data.User;

import java.util.Iterator;

public class StudentGroupServiceImpl implements DataService{

    @Override
    public void create(User user) {
        DataService.super.create(user);
    }

    @Override
    public User read(User user) {
        return DataService.super.read(user);
    }

    @Override
    public StudentGroup createGroup(int groupNumber) {
        return null;
    }

    @Override
    public StudentGroup getGroup() {
        return null;
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

    @Override
    public void removeStudent(Student name) {
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (name.equals(student.getName())) studentGroup.remove();
        }
    }

}
