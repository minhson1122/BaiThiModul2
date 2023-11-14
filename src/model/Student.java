package model;

public class Student {
    private double ScoreAVG;
    private String gender;
    private int id;
    private String name;
    private int age;
    private String address;
    private static int idIncrement = 1;

    public Student(String name, int age, String address,String gender, double ScoreAVg) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.ScoreAVG = ScoreAVg;
        idIncrement++;

    }

    public Student(int id, String name, int age, String address,String gender,double ScoreAVG) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.ScoreAVG = ScoreAVG;

    }

    public Student(String datum, int age, String datum1, String datum2, String datum3) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        Student.idIncrement = idIncrement;
    }

    public double getScoreAVG() {
        return ScoreAVG;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ScoreAVG=" + ScoreAVG +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getData(){
        return id + "|" + name + "|" + age + "|" + address + "|" +gender + "|" + ScoreAVG + "\n";
    }
}
