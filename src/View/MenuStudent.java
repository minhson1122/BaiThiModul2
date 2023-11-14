package View;

import manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {

        int choice;
        do {
            System.out.println("======= Menu Student Manager =======\n1.them hoc sinh \n2.sua hoc sinh \n3.xoa hoc sinh\n4.hien thi tat ca\n5.Sap xep hoc sinh theo diem trung binh\n0.Thoat");
            System.out.println("nhap lua chon");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showFormedit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    softStudent();
                    break;
            }
        } while (choice != 0);
    }

    public void showAll(){
        System.out.println("Danh sach sinh vien hien tai dang co");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student: list) {
            System.out.println(student);
        }
    }
    public void showMenuAdd() {
        System.out.println("====== Day la Menu them moi ======");
        System.out.println("nhap ten");
        String name = inputString.nextLine();
        System.out.println("nhap tuoi");
        int age = inputInt.nextInt();
        System.out.println("nhap dia chi");
        String address = inputString.nextLine();
        System.out.println("nhap gioi tinh");
        String gender = inputString.nextLine();
        System.out.println("nhap diem trung binh");
        double ScoreAVG = inputInt.nextDouble();
        Student student1 = new Student(name, age, address,gender,ScoreAVG);
        studentManager.add(student1);
        System.out.println("===== them thanh cong =====");

    }
    public void showMenuDelete(){
        System.out.println("===== Xoa hoc sinh =====");
        System.out.println("nhap vao id");
        int idDelete = inputInt.nextInt();
        studentManager.Delete(idDelete);
        System.out.println("Xoa thanh cong");
    }
    public void showFormedit(){
        System.out.println("===== Menu Edit ======");
        System.out.println("nhap id muon sua");
        int idEdit = inputInt.nextInt();
        System.out.println("nhap ten");
        String name = inputString.nextLine();
        System.out.println("nhap tuoi");
        int age = inputInt.nextInt();
        System.out.println("nhap dia chi");
        String address = inputString.nextLine();
        System.out.println("nhap gioi tinh");
        String gender = inputString.nextLine();
        System.out.println("nhap diem trung binh");
        double ScoreAVG = inputInt.nextDouble();
        Student student = new Student(name,age,address,gender,ScoreAVG);
        studentManager.upDate(idEdit,student);
        System.out.println("Sửa thành công");

    }
    public void softStudent(){
        System.out.println("sắp xếp theo thứ tự điểm từ thấp đến cao");

        studentManager.ScoreAVG();
    }
}
