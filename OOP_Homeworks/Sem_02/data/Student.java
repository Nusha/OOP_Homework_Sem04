package Sem_02.data;

public class Student extends User implements Comparable<Student> {

    private int groupnum;

    public Student(String name, int birthyear, String passnumber, int groupnum) {
        super(name, birthyear, passnumber);
        this.groupnum = groupnum;
    }

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }

    @Override
    public int compareTo(Student o) {

        return Integer.compare(this.birthyear, o.birthyear);
    }
}
