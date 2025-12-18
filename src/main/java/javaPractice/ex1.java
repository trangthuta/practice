package javaPractice;

import java.util.Scanner;

public class ex1 {
    /*
    Exercise 1:
Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
*/
    public static void tongSo() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        a = sc.nextInt();
        System.out.print("Nhap so b : ");
        b = sc.nextInt();
        System.out.println("Tong cua 2 so la :" + (a + b));
    }

    /*
    Exercise 2:
Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
     */
    public static void bai2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chon chuc nang:\n" + "1. x + y * z\n" + "2. (x + y) % z\n" + "3. (x + y) % z - 6\n" + "4. (x + y) % z");

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        if (a > 4 || a <= 0) {
            System.out.println("Khong co menu nay!");
            return;
        } else {
            System.out.print("Nhap so x: ");
            int x = sc.nextInt();

            System.out.print("Nhap so y: ");
            int y = sc.nextInt();

            System.out.print("Nhap so z: ");
            int z = sc.nextInt();
            if (a == 1) System.out.println("Ket qua = " + (x + y * z));
            else if (a == 2) {
                System.out.println("Ket qua = " + ((x + y) % z));
            } else if (a == 3) {
                System.out.println("Ket qua = " + ((x + y) % z - 6));
            } else {
                System.out.println("Ket qua = " + ((x + y) % z));
            }

        }
    }

    /*
    Exercise 3:
Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
     */

    public static void bai3() {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        a = scanner.nextLine();
        System.out.print("Nhap so b : ");
        b = scanner.nextLine();
        if (!a.matches("[01]+") || !b.matches("[01]+")) {
            System.out.println("So nhi phan thuong chi 1 va 0 !");
        } else {
            System.out.println("Input hop le!");
            int num1 = Integer.parseInt(a, 2);
            int num2 = Integer.parseInt(b, 2);
            int result = num1 * num2;
            String multiBinary = Integer.toBinaryString(result);
            System.out.println("Nhan hai so nhi phan " + a + " va " + b + " la: " + multiBinary);
        }
        scanner.close();
    }
    /*
    Exercise 4:
Write a Java program that accepts two integer values from the user and return the larger values. However if
the two values are the same, return 0 and return the smaller value if the two values have the same remainder
when divided by 6.
Sample Output:
Input the first number : 12
Input the second number: 13
Result: 13
     */

    public static void bai4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(0);
        } else if (Math.floorMod(a, 6) == Math.floorMod(b, 6)) {
            System.out.println((a < b) ? a : b);
        } else {
            System.out.println((a > b) ? a : b);
        }
        sc.close();
    }
        /*

Exercise 5:

Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per
hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
     */

    public static void bai5() {
        int gio, phut, giay;
        float khoangCach;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap gio: ");
            gio = sc.nextInt();
        } while (gio < 0 || gio > 23);

        do {
            System.out.print("Nhap phut: ");
            phut = sc.nextInt();
        } while (phut < 0 || phut > 59);

        do {
            System.out.print("Nhap giay: ");
            giay = sc.nextInt();
        } while (giay < 0 || giay > 59);

        System.out.println("Thoi gian hop le: " + gio + " gio " + phut + " phut " + giay + " giay");

        System.out.print("Nhap khoang cach (tinh bang met): ");
        khoangCach = sc.nextFloat();

        int tongGiay = gio * 3600 + phut * 60 + giay;

        double speedMs = (double) khoangCach / tongGiay;
        double speedKmh = speedMs * 3.6;
        double speedMph = speedKmh * 0.621371;

        System.out.println("Your speed in meters/second is : " + speedMs);
        System.out.println("Your speed in km/h : " + speedKmh);
        System.out.println("Your speed in miles/h : " + speedMph);
        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bai;

        do {
            System.out.println("Chon bai muon cham tu 1-5, 0 de thoat): ");
            bai = sc.nextInt();

            switch (bai) {
                case 1:
                    tongSo();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai5();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Khong co bai nay! Chi chon tu 1-5.");
            }
        } while (bai != 0);
        sc.close();
    }


}
