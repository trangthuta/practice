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
    private static class Parent{
        public static void message() {

        }
    }

    public static void bai1(Scanner scanner) {
        Student s1 = new Student();
        System.out.print("Nhap ten nguoi dung : ");
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.printName();
    }
    public static void bai2(Scanner scanner) {

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
                    bai2(scanner);
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
