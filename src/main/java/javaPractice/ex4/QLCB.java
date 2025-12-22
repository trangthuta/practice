package javaPractice.ex4;

import java.util.Scanner;

public class QLCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU QUAN LY CAN BO =====");
        System.out.println("1. Them moi can bo");
        System.out.println("2. Tim kiem theo ho ten");
        System.out.println("3. Hien thi danh sach can bo");
        System.out.println("4. Thoat chuong trinh");
        System.out.print("Chon chuc nang: ");

        int choice = sc.nextInt();
        sc.nextLine() ;
        CanBo canBo = new CanBo();
        switch (choice) {
            case 1:
                canBo.themMoiCanBo(sc);
                break;
            case 2:
                System.out.println("Chuc nang tim kiem theo ho ten");
                break;
            case 3:
                canBo.hienThiDanhSach();
                break;
            case 4:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
}
