package valiDateStudent;

import model.Student;

import java.io.*;
import java.util.ArrayList;

public class readAndWriteFile {
    private File file = new File("file.csv");

    public void writeFile(ArrayList<Student> students){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: students) {
                line += student.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Student student = new Student(data[0],Integer.parseInt(data[1]),data[2],data[3],data[4]);
                students.add(student);
            }
            bufferedReader.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return students;
    }
}
