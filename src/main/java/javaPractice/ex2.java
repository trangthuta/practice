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
public static void bai1() {
    float a ;
    Scanner scanner = new Scanner(System.in) ;
    a= scanner.nextFloat() ;
    if (a>0){
        System.out.println( a + " is negative !");
    }else {
        System.out.println(a + " is positive ! ");
    }
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int bai ;

    do {
        System.out.print("Nhap bai muon test :" );
        bai = scanner.nextInt() ;

        switch (bai){
            case 1 :
                bai1();
                break;
            case 0:
                System.out.println("Thoat chuong trinh!");
                break;
            default:
                System.out.println("Khong co bai nay! Chi chon tu 1-5.Chon 0 de thoat chuong trinh !");
        }
    }while (bai !=0);
}



    /*
Exercise 2:
Write a program in Java to display the cube of the number upto given an integer.
Test Data
Input number of terms : 4
Expected Output :

Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
Exercise 3:
Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a
number in a row.The pattern is as follows :

1
22
333
4444

Exercise 4:
Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the
number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

Exercise 5:

Training Assignments Java Basics (Automation Test) Issue/Revision: x/y

25e-BM/HR/HDCV/FSOFT v1.1 Internal use 6/6
Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
     */
}
