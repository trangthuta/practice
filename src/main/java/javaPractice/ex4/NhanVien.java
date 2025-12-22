package javaPractice.ex4;

import java.util.Scanner;

public class NhanVien extends CanBo {
    String viec;

    public void nhapViec(Scanner scanner) {
        scanner.nextLine() ;
        System.out.print("Nhap viec : ");
        this.viec = scanner.nextLine();
        System.out.println("Viec nhan vien la :" + this.viec);
    }
}
