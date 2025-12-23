package javaPractice.ex4;

import java.util.Scanner;

public class ex4 {

    private static class Student {
        String name;

        public void printName() {
            if  ( this.name == null|| this.name.isEmpty()) {
                System.out.println("Unknown");
            } else {
                System.out.println("Ten nguoi dung la : " + name);
            }
        }
    }
    private static class subParent extends Parent{
        public static void message1() {
            System.out.println("This is first subclass 1");
        }
    }
    private static class subParent2 extends Parent{
        public static void message2() {
            System.out.println("This is first subclass 2");
        }
    }
    private static abstract class Parent{
        public static void message() {
        subParent subParent = new subParent() ;
        subParent2 subParent2 = new subParent2() ;
        subParent.message1();
        subParent2.message2();
        }
    }

    public static void bai1(Scanner scanner) {
        Student s1 = new Student();
        System.out.print("Nhap ten nguoi dung : ");
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.printName();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bai;
        do {
            System.out.print("Nhap bai muon kiem tra, nhap 0 de thoat !  :");
            bai = scanner.nextInt();
            switch (bai) {
                case 1:
                    bai1(scanner);
                    break;
                case 2:
                    Parent.message();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh !");
                    break;
                default:
                    System.out.println("Khong co bai nay , nhap lai !");
                    break;
            }
        } while (bai != 0);
    }
}
