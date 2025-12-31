package javaPractice.ex7;

import java.io.*;

public class ex1 {
    public static void main(String[] args) throws IOException {
        String output = System.getProperty("user.dir") + "\\src\\main\\java\\javaPractice\\ex7\\output.txt";
        String chuoi = "Hi cac ban nhe !";
        System.out.println("File duoc ghi tai: " + output);

        OutputStream outputStream = new FileOutputStream(output);
        outputStream.write(chuoi.getBytes());
        outputStream.close();

        File path = new File(output);

        if (path.exists() && path.length() > 0) {
            InputStream in = new FileInputStream(output);
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println(" Da doc ---");
            in.close();

        } else {
            System.out.println("File rong, khong co gi de doc!");
        }
    }
}