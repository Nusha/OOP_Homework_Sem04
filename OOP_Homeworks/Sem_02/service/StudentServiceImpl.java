package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.data.Teacher;
import Sem_02.data.User;
import Sem_02.util.ReaderFromTxt;
import Sem_02.util.WriterToTxt;

import java.util.List;

public class StudentServiceImpl implements DataService {

    @Override
    public void create(User user) {
        WriterToTxt.writeToTxt(user);
    }

    @Override
    public User read(User user) {
         return ReaderFromTxt.readFromTxt(user);

    }

    /** Работа над ошбками 2 урок.
     * Чтобы реализовать этот метод возпользуетесь статическими методами из пекеджа utils для получения учителя и учеников
     * Обратился к пэкэджу util, к статическим методам чтения учителя и листа учеников.
     */
    @Override
    public StudentGroup createGroup(int groupNumber) {
        Teacher teacher = ReaderFromTxt.readTeacherFromTxt();
        List<Student> studentList= ReaderFromTxt.readStudentsFromTxt();
        return new StudentGroup(teacher,studentList, groupNumber);
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
