package Sem_02.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentlist;

    private int groupnum;

    public StudentGroup(Teacher teacher, List<Student> studentlist, int groupnum) {
        this.teacher = teacher;
        this.studentlist = studentlist;
        this.groupnum = groupnum;
    }

    public StudentGroup() {

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }
}
