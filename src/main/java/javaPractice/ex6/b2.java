package javaPractice.ex6;

import java.util.Arrays;

public class b2 {
    public static void main(String[] args) {

        int[] mang = new int[65];
        int[] daoMang = new int[65];

        for (int i = 0; i < 65; i++) {
            mang[i] = i;
        }

        for (int j = 64; j >=0; j--) {
            daoMang[64-j]=mang[j] ;
        }

        System.out.println("Mang cua ban la: " + Arrays.toString(mang));
        System.out.println("Mang sau dao nguoc la: " + Arrays.toString(daoMang));
    }
}
