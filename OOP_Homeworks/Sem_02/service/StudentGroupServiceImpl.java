package Sem_02.service;
import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.data.Teacher;
import Sem_02.util.ReaderFromTxt;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService{


    /** Работа над ошбками 2 урок.
     * StudentServiceImpl имплементировать от него и реализовать метод createGroup.
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
        StudentGroup group = new StudentGroup();
        group = new StudentGroup(group.getTeacher(),group.getStudentlist());
        return group;
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
