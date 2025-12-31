package javaPractice.ex7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class ex2 {
    String first;
    String last;
    String email;

    public ex2() {
        first = "Tạ Thị Thu";
        last = "Trang";
        email = "trangthuta9@gmail.com";
    }

    private void writeData(String email, String last, String first) throws IOException {
        try (OutputStream outputStream = new FileOutputStream("ex7_2_output.txt")) {
            String data = first + " " + last + " , " + email;
            outputStream.write(data.getBytes(StandardCharsets.UTF_8));
        }
    }

    private void printData() throws IOException {
        InputStream inputStream = new FileInputStream("ex7_2_output.txt");
        System.out.println("Data : ");
        byte[] bytes = inputStream.readAllBytes();
        String data = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(data);
        inputStream.close();
    }

    public static void main(String[] args) throws IOException {
        ex2 ex2 = new ex2();
        ex2.writeData(ex2.email, ex2.last, ex2.first);
        ex2.printData();
    }
}
