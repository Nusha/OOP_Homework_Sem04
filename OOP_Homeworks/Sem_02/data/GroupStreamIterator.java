package Sem_02.data;

import java.util.Iterator;

public class GroupStreamIterator implements Iterator<GroupStream> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public GroupStream next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
