package Tren;

import Vagon.Vagon;

import java.util.Scanner;

public class Tren {
    public static void main(String[] args) {
        System.out.println("Lütfen 1 ile 10 arasinda bir tahminde bulununuz.");
        Scanner vagonTahmini = new Scanner(System.in);
        int tahmin = vagonTahmini.nextInt(10);
        if (tahmin < 11 && tahmin > 0) {
            for (int i = 1; i <= 4; i++) {
                if (tahmin == Vagon.kacaginVagonu) {
                    System.out.println("Tebrikler " + i + ". tahminizde buldunuz.");
                    System.out.println(" Puaniniz " + 100);
                    break;
                } else if (Vagon.kacaginVagonu > tahmin) {
                    System.out.println("Daha buyuk bir deger giriniz.");
                } else {
                    System.out.println("Daha kucuk bir deger giriniz.");
                }
                if (i != 4) {
                    tahmin = vagonTahmini.nextInt(10);
                } else {
                    System.out.println("Hakkiniz bitti kacagi bulamadiniz . Puaniniz " + 0);
                }
            }
        }
    }
}
