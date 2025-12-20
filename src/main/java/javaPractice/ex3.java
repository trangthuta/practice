package javaPractice;

import java.util.Arrays;
import java.util.Scanner;




public class ex3 {
    private static class Student {
        String name = "John";
        int roll_no = 2;
    }

    static class Area {
        public static void returnArea(int a, int b) {
            System.out.println("Dien tich hinh chu nhat co chieu dai " + a + " va chieu rong " + b + " la : " + a * b);
        }
    }

    private static class Employee {
        String name;
        String address;
        int namKinhNghiem;
        float luong, soGioLamViec;

        void getInfo(Scanner scanner) {
            System.out.print("Nhap luong : ");
            luong = scanner.nextFloat();
            System.out.print("Nhap so gio lam viec : ");
            soGioLamViec = scanner.nextFloat();
            System.out.println("So luong da mhap " + luong + " ,so gio lam viec da  nhap la " + soGioLamViec);
        }

        void AddSal() {
            if (luong < 500) {
                luong = luong + 10;
            }
        }

        void AddWork() {
            if (soGioLamViec > 6) {
                luong = luong + 5;
            }
        }
    }

    private static class Matrix {
        int hang, cot;
        int[][] mangHaiChieu;

        void nhapMang(Scanner scanner) {
            System.out.print("Nhap so hang: ");
            hang = scanner.nextInt();

            System.out.print("Nhap so cot: ");
            cot = scanner.nextInt();

            mangHaiChieu = new int[hang][cot];

            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print("mang[" + i + "][" + j + "] = ");
                    mangHaiChieu[i][j] = scanner.nextInt();
                }
            }
        }

        void inMang() {
            System.out.println("Ma tran:");
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print(mangHaiChieu[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    //    Exercise 1:
//    Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of
//    roll_no as '2' and that of name as "John" by creating an object of the class Student.
    private static void bai1() {
        Student s1 = new Student();
        System.out.println(s1.name + " is " + s1.roll_no);
    }

    //    Exercise 2:
//    Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length
//    and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area
//    of the rectangle. Length and breadth of rectangle are entered through keyboard.
    public static void bai2(Scanner scanner) {
        int a, b;
        Area area = new Area();
        System.out.print("Nhap chieu dai : ");
        a = scanner.nextInt();
        System.out.print("Nhap chieu rong : ");
        b = scanner.nextInt();
        if (a > b) {
            Area.returnArea(a, b);
        } else {
            System.out.println("Chieu dai phai lon hon chieu rong!");
        }

    }

    //    Exercise 3:
//    Write a program that would print the information (name, year of joining, salary, address) of three employees
//    by creating a class named 'Employee'. The output should be as follows:
//    Name Year of joining Address
//    Robert 1994 64C- WallsStreat
//    Sam 2000 68D- WallsStreat
//    John 1999 26B- WallsStreat
    public static void bai3(Scanner scanner) {
        Employee employee = new Employee();

        scanner.nextLine(); // đọc bỏ ký tự xuống dòng còn sót từ lần nhập trước (nếu có)

        System.out.print("Nhap ten nhan vien: ");
        employee.name = scanner.nextLine();

        System.out.print("Nhap nam kinh nghiem: ");
        employee.namKinhNghiem = scanner.nextInt();
        scanner.nextLine(); // đọc bỏ ký tự xuống dòng thừa

        System.out.print("Nhap dia chi: ");
        employee.address = scanner.nextLine();

        System.out.println(employee.name + " - " + employee.namKinhNghiem + " - " + employee.address);
    }

    /*




Exercise 4:
Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6
hours.
 */
    public static void bai4(Scanner scanner) {
        Employee employee = new Employee();
        employee.getInfo(scanner);
        employee.AddSal();
        employee.AddWork();
        System.out.println("Muc luong cuoi cung la : " + employee.luong);
    }


//    Exercise 5:
//    Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns
//    of a new Matrix object. The Matrix class has the following information:
//            1 - number of rows of matrix
//2 - number of columns of matrix
//3 - elements of matrix in the form of 2D array

    public static void bai5(Scanner scanner) {
        Matrix matrix = new Matrix();
        matrix.nhapMang(scanner);
        matrix.inMang();
    }


    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap bai muon kiem tra (nhap 0 de thoat ) : ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2(scanner);
                    break;
                case 3:
                    bai3(scanner);
                    break;
                case 4:
                    bai4(scanner);
                    break;
                case 5:
                    bai5(scanner);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh !");
                    break;
                default:
                    System.out.println("Khong co bai nay ! chi co bai tu 1-5!Nhap lai di !");

            }

        } while (a != 0);
        scanner.close();
    }

}
