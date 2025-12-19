package javaPractice;

import java.util.Scanner;

public class ex2 {
    //    Exercise 1:
//    Write a Java program that reads a floating-point number and prints &quot;zero&quot; if the number is zero. Otherwise,
//    print &quot;positive&quot; or &quot;negative&quot;. Add &quot;small&quot; if the absolute value of the number is less than 1, or &quot;large&quot; if it
//    exceeds 1,000,000.
//    Test Data
//    Input a number: 25
//    Expected Output :
//    Input value: 25
//    Positive number
    public static void bai1(Scanner scanner) {
        System.out.print("Input a number: ");
        float a = scanner.nextFloat();

        System.out.println("Input value: " + a);

        if (a == 0) {
            System.out.println("Zero");
        } else {
            if (a > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }

            float abs = Math.abs(a);

            if (abs < 1) {
                System.out.print(" small");
            } else if (abs > 1_000_000) {
                System.out.print(" large");
            }

            System.out.println(" number");
        }
    }


//    Exercise 2:
//    Write a program in Java to display the cube of the number upto given an integer.
//    Test Data
//    Input number of terms : 4
//    Expected Output :
//
//    Number is : 1 and cube of 1 is : 1
//    Number is : 2 and cube of 2 is : 8
//    Number is : 3 and cube of 3 is : 27
//    Number is : 4 and cube of 4 is : 64

    public static void bai2(Scanner scanner) {
        int a;
        System.out.print("Nhap so nguyen a : ");
        a = scanner.nextInt();
        int lapPhuong = 0;
        for (int i = 1; i <= a; i++) {
            lapPhuong = i * i * i;
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + lapPhuong);
        }
    }

    //    Exercise 3:
//    Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a
//    number in a row.The pattern is as follows :
//
//            1
//            22
//            333
//            4444
    public static void bai3(Scanner scanner) {
        int a;
        System.out.print("Nhap so : ");
        a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //    Exercise 4:
//    Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the
//    number is equal to the number itself, then the number is called an Armstrong number.
//    For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    public static void bai4(Scanner scanner) {
        System.out.println("Armstrong numbers từ 1 đến 500 là:");

        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            int temp = num;

            // Tính tổng lập phương các chữ số
            while (temp != 0) {
                int digit = temp % 10; // lấy chữ số cuối
                sum += digit * digit * digit;
                temp /= 10; // loại bỏ chữ số cuối
            }

            // Kiểm tra nếu tổng bằng số gốc
            if (sum == num) {
                System.out.println(num);
            }
        }
    }


    /*
Exercise 5:
Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
 */
    public static void bai5(Scanner scanner) {
        int a;
        double logarit =0;
        System.out.print("Nhap so a : ");
        a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i%2!=0){
                logarit=logarit+1.0/i;
            }else {
                logarit=logarit-1.0/i;
            }
        }
        System.out.println("Logarit cua so " + a + " vua nhap la : " + logarit);


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bai;

        do {
            System.out.print("Nhap bai muon test :");
            bai = scanner.nextInt();

            switch (bai) {
                case 1:
                    bai1(scanner);
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
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Khong co bai nay! Chi chon tu 1-5.Chon 0 de thoat chuong trinh !");
            }
        } while (bai != 0);
        scanner.close();

    }


}
