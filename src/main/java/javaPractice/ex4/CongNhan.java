package javaPractice.ex4;

import java.util.Scanner;

public class CongNhan extends CanBo {
    int bac;

    public void nhapBacCanBo(Scanner scanner) {
        do {
            System.out.print("Nhap bac 1-10 :");
            this.bac = scanner.nextInt();

        } while (bac < 1 || bac > 10);
        System.out.println("Bac luong cong nhan  la : "+ this.bac);

    }
}
