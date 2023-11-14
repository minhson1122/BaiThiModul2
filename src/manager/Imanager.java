package manager;

import java.util.ArrayList;

public interface Imanager<E>{
    void add(E e);
    void Delete(int id);
    int findIndexByid (int id);
    void upDate(int id, E e);
    ArrayList<E> findAll();
    ArrayList<E> ScoreAVG();
}
