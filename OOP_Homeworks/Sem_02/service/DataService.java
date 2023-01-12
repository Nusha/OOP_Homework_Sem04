package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.User;

public interface DataService {
    void create(User user);
    User read(User user); // Удалил дефолтные методы.

   


    void removeStudent (Student name);

}
