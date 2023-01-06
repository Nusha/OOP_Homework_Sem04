package Sem_02.service;

import Sem_02.data.StudentGroup;
import Sem_02.data.User;

public interface DataService {
    default void create(User user){

    }
    default User read(User user) {

        return user;
    }
    default StudentGroup createGroup(int groupnum) {
        return new StudentGroup(groupnum);
    }
}
