package Tren;

import Vagon.Vagon;

import java.util.Scanner;

public class Tren {
    public static void main(String[] args) {
        System.out.println("Lütfen 1 ile 10 arasinda bir tahminde bulununuz.");
        Scanner vagonTahmini = new Scanner(System.in);
        int tahmin = vagonTahmini.nextInt(10);
        if (tahmin < 11 && tahmin > 0) {
            for (int i = 100; i >= 25; i-=25) {
                if (tahmin == Vagon.kacaginVagonu) {
                    System.out.println("Tebrikler. Bildiniz.. Puaniniz : " + i );
                    break;
                } else if (Vagon.kacaginVagonu > tahmin) {
                    System.out.println("Malesef arka vagonlarda. ");
                } else {
                    System.out.println("Malesef on vagonlarda. ");
                }
                if (i != 25) {
                    tahmin = vagonTahmini.nextInt(10);
                } else {
                    System.out.println("Malesef bulamadiniz. Hakkiniz bitti. Puaniniz : " + 0);
                }
            }
        }
    }
}
