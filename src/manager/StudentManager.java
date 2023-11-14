package manager;

import model.Student;

import java.util.ArrayList;
import valiDateStudent.readAndWriteFile;

public class StudentManager implements Imanager<Student> {
    private readAndWriteFile readAndWriteFile = new readAndWriteFile();

    ArrayList<Student> list;

    public StudentManager(ArrayList<Student> list) {
        this.list = (ArrayList<Student>) readAndWriteFile.readFile();
    }

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        list.add(student);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public void Delete(int id) {
        int index = findIndexByid(id);
        list.remove(index);
    }

    @Override
    public int findIndexByid(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) ;
            return i;
        }
        return -1;

    }

    @Override
    public void upDate(int id, Student student) {
        int index = findIndexByid(id);
        list.set(index, student);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public ArrayList<Student> findAll() {
        return list;
    }

    @Override
    public ArrayList<Student> ScoreAVG() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).getScoreAVG() > list.get(j + 1).getScoreAVG()) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (Student student : list) {
            System.out.println(student);


        }
        return null;
    }
}