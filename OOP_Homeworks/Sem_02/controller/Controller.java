package Sem_02.controller;


import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.service.DataService;
import Sem_02.service.StudentServiceImpl;

public class Controller {
    DataService studentService;

    private Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupnum) {
    return (studentService.createGroup(groupnum));
    }
}
