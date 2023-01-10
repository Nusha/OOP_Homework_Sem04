package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.data.User;
import Sem_02.util.ReaderFromTxt;
import Sem_02.util.WriterToTxt;

public class StudentServiceImpl implements DataService {

    @Override
    public void create(User user) {
        WriterToTxt.writeToTxt(user);
    }

    @Override
    public User read(User user) {
         return ReaderFromTxt.readFromTxt(user);

    }

    @Override
    public StudentGroup createGroup(int groupnum) {
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

    }

}
