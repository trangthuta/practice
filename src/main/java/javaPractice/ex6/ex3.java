package javaPractice.ex6;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ex3 {
    static Stack<Integer> a = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex3 pt = new ex3(); // tạo 1 lần

        while (true) {
            System.out.println("""
                    ==================================================
                    Stack Operations Menu
                    ==================================================
                    1. Add items

                    2. Delete items

                    3. Show the number of items

                    4. Show min and max items

                    5. Find an item

                    6. Print all items

                    7. Exit
                    """);

            System.out.print("Nhap menu lua chon : ");
            String menu = sc.nextLine();

            int mn;
            try {
                mn = Integer.parseInt(menu);
            } catch (NumberFormatException e) {
                System.out.println("Menu phai nhap so!");
                continue;
            }

            switch (mn) {
                case 1:
                    pt.addItem(sc);
                    break;

                case 2:
                    pt.deleteItem(sc);
                    break;

                case 3:
                    showNumberOfIterm(sc);
                    break;

                case 4:
                    showMinAndMax(sc);
                    break;

                case 5:
                    findItem(sc);
                    break;


                case 6:
                    printAllItems();
                    break;

                case 7:
                    System.out.println("Thoat chuong trinh!");
                    return;

                default:
                    System.out.println("Khong co case nay!");
            }
        }
    }

    public void addItem(Scanner scanner) {
        int i = a.size();

        while (true) {
            System.out.print("Nhap phan tu thu " + i + " (nhap q de thoat): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                a.push(value);
                i++;
                System.out.println("Stack hien tai: " + a);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }

    public void deleteItem(Scanner scanner) {
        while (true) {
            String index;
            System.out.print("Nhap vi tri phan tu muon xoa tu 0-" + (a.size() - 1) + ", nhap x de thoat: ");
            index = scanner.nextLine();
            if (index.equalsIgnoreCase("x")) {
                System.out.println("da thoat !");
                break;
            }
            try {
                int i = (Integer.parseInt(index));
                a.remove(i);
                System.out.println("Stack hien tai : " + a);
            } catch (NumberFormatException e) {
                System.out.println("Vi tri muon xoa phai nhap so!");
            }


        }

    }

    public static void showNumberOfIterm(Scanner scanner) {
        System.out.println("So phan tu cua mang la : " + a.size());
    }

    public static void showMinAndMax(Scanner scanner) {
        if (!a.isEmpty()) {
            System.out.println("Min la : " + Collections.min(a));
            System.out.println("Max la : " + Collections.max(a));
        } else {
            System.out.println("Stack dang rong ! Vui long chon menu 1 de nhap stack .");
        }

    }

    public static void findItem(Scanner scanner) {
        System.out.print("Nhap so muon tim : ");
        String input = scanner.nextLine();
        try {
            int x = Integer.parseInt(input);
            if (a.contains(x)) {
                System.out.println(x + " co trong stack!");
            } else {
                System.out.println(x + " khong co trong stack!");
            }
        } catch (NumberFormatException e) {
            System.out.println("So muon tim phai la kieu integer.");
        }
    }

    public static void printAllItems() {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Phan tu thu " + i + " cua stack la : " + a.get(i));
        }

    }

}
