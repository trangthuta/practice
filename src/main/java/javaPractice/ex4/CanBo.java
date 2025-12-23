package javaPractice.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class CanBo {
    String hoten, diaChi, gioiTinh;
    int tuoi;
    String tiep;   // ✅ đổi sang String
    ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();

    public void themMoiCanBo(Scanner scanner) {

        do {
            System.out.print("Nhap ho ten : ");
            this.hoten = scanner.nextLine();

            System.out.print("Nhap dia chi : ");
            this.diaChi = scanner.nextLine();

            System.out.print("Nhap gioi tinh : ");
            this.gioiTinh = scanner.nextLine();

            System.out.print("Nhap tuoi : ");
            this.tuoi = scanner.nextInt();
            scanner.nextLine(); // ✅ bắt buộc

            int viTri;
            System.out.println("Nhap vi tri : ");
            System.out.println("1. Ki su");
            System.out.println("2. Nhan vien");
            System.out.println("3. Cong nhan");
            System.out.print("Nhap so : ");
            viTri = scanner.nextInt();
            scanner.nextLine() ;

            KiSu kiSu = new KiSu();
            CongNhan congNhan = new CongNhan();
            NhanVien nhanVien = new NhanVien();

            switch (viTri) {
                case 1:
                    kiSu.nhapNganh(scanner);
                    System.out.println(hoten + " - " + diaChi + " - " + gioiTinh + " - " + tuoi + " - " + kiSu.nganh);
                    break;

                case 2:
                    nhanVien.nhapViec(scanner);
                    System.out.println(hoten + " - " + diaChi + " - " + gioiTinh + " - " + tuoi + " - " + nhanVien.viec);
                    break;

                case 3:
                    congNhan.nhapBacCanBo(scanner);
                    System.out.println(hoten + " - " + diaChi + " - " + gioiTinh + " - " + tuoi + " - " + congNhan.bac);
                    break;

                default:
                    System.out.println("Khong co vi tri nay!");
            }
            // them vao danh sach nhan vien
            CanBo cb = new CanBo();
            cb.hoten = this.hoten;
            cb.diaChi = this.diaChi;
            cb.gioiTinh = this.gioiTinh;
            cb.tuoi = this.tuoi;
            danhSachNhanVien.add(cb);

            System.out.println(">> Da them can bo vao danh sach!");
            System.out.println(danhSachNhanVien.size());

            // ✅ hỏi nhập tiếp
            System.out.print("Ban co muon nhap tiep? (y/n): ");
            this.tiep = scanner.nextLine();

        } while (this.tiep.equalsIgnoreCase("y"));
    }

    public void hienThiDanhSach() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sach can bo dang rong!");
            return;
        }

        System.out.println("===== DANH SACH CAN BO =====");
        for (CanBo cb : danhSachNhanVien) {
            System.out.println(
                    cb.hoten + " - " +
                            cb.diaChi + " - " +
                            cb.gioiTinh + " - " +
                            cb.tuoi
            );
        }
    }
}
