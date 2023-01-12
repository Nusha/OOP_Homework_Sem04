package Sem_02.controller;

import Sem_02.data.GroupStream;
import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.service.*;
import java.util.List;
import java.awt.*;


public class Controller<G, I extends Number> {
    private DataService studentService;
    private StudentGroupService studentGroupService;
    private GroupStreamService  groupStreamService;

    private Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Controller(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public Controller(GroupStreamService groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupService.createGroup(groupNumber);
    }

    public void removeStudent(Student name) { studentGroupService.removeStudent(name); };

    public void sortStream(List groupStream) {groupStreamService.sortStream(groupStream);}


//    public Controller(GroupStreamServiceImpl streamService) {
//        this.groupStreamService = streamService;
//    }
//
//    public void streamListSort(List<GroupStream> groupStream)
//    {
//        groupStreamService.sortStream( groupStream);
//    }


//    public StudentGroup createGroup(int groupnum) {
//    return (studentService.createGroup(groupnum));
//    }
}
