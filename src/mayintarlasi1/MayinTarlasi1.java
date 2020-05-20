package mayintarlasi1;

import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;

public class MayinTarlasi1 {

    public static void main(String[] args) {

        int mayin;
        int satir;
        int sutun;

        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        try {
            System.out.println("Satır Sayısı : ");
            satir = s.nextInt();
            System.out.println("Sütun Sayısı : ");
            sutun = s.nextInt();
            mayin = (sutun * satir) / 5;

            int[][] tahta = new int[satir][sutun];

            int adet = 0;
            int s1; 
            int s2; 

            for (int i = adet; i < mayin; i++) {
                s1 = rnd.nextInt(satir);
                s2 = rnd.nextInt(sutun);
                if (tahta[s1][s2] != 9) {

                    tahta[s1][s2] = 9;
                    adet += 1;

                }

            }
            for (int g = 0; g < tahta.length; g++) {
                for (int m = 0; m < tahta[g].length; m++) {
                    int maksimumG = g + 1;
                    int maksimumM = m + 1;
                    int minimumG = g - 1;
                    int minimumM = m - 1;
                    int adet2 = 0;

                    if (g == 0) {
                        minimumG = 0;
                    }
                    if (m == 0) {
                        minimumM = 0;
                    }
                    if (g == satir - 1) {
                        maksimumG = satir - 1;
                    }
                    if (m == sutun - 1) {
                        maksimumM = sutun - 1;
                    }

                    if (tahta[g][m] != 9) {
                        adet2 = 0;
                        for (int z = minimumG; z <= maksimumG; z++) {
                            for (int x = minimumM; x <= maksimumM; x++) {
                                if (tahta[z][x] == 9) {
                                    adet2++;
                                }
                                if (adet > 0) {
                                    tahta[g][m] = adet2;
                                }
                            }
                        }
                    }
                    System.out.print(tahta[g][m] + " ");
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.err.println("tam sayı giriniz");
        }

    }
}
