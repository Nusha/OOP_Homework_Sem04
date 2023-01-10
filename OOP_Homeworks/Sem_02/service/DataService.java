package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.data.User;

public interface DataService {
    default void create(User user){

    }
    default User read(User user) {

        return user;
    }
    StudentGroup createGroup(int groupNumber);

    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void removeStudent (Student name);

}
