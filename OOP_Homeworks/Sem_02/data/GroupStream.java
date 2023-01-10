package Sem_02.data;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class GroupStream implements Iterable<StudentGroup>{

    private List studentGroups;

    public GroupStream(List studentGroups) {
        this.studentGroups = studentGroups;
    }

    public List getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super StudentGroup> action) {
        Iterable.super.forEach(action);
    }
}
