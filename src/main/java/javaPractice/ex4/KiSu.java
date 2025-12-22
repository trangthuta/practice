package javaPractice.ex4;

import java.util.Scanner;

public class KiSu extends CanBo {
    String nganh;

    public void nhapNganh(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhap nganh dao tao : ");
        this.nganh = scanner.nextLine();
        System.out.println("Nganh dao tao la : " + this.nganh);

    }
}
