package javaPractice.ex6;

import java.util.Arrays;
import java.util.Scanner;

public class b1 {

    static int[] list = {1, 2, 3, 4, 5};

    public static void replace(Scanner scanner) {
        int nd;

        System.out.println("Mang ban dau : " + Arrays.toString(list));

        while (true) {
            System.out.print("Nhap gia tri moi cho phan tu thu 2: ");

            if (scanner.hasNextInt()) {   // ✔ nếu là số
                nd = scanner.nextInt();
                break;                   // ✔ đúng → thoát vòng lặp
            } else {
                System.out.println("Nhap sai! Vui long nhap SO.");
                scanner.next();          // ✔ bỏ dữ liệu sai
            }
        }

        list[1] = nd;

        System.out.println("Mang sau khi thay the : " + Arrays.toString(list));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        replace(sc);
    }
}
