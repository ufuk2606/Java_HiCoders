package Tren;

import Vagon.Vagon; // Vagon clasinda olusturulan sayiyi bu classta kullandigimiz icin import edilir

import java.util.Scanner; // consoldan bilgl alirken kullandigimiz icin import edilir
/*
Bu program 1 ile 10 sayilari arasinda tahmin edilen bir sayisi 4 denemede bulma uzerine calisir.
Kacinci tahminde bilindiyse ona gore puanlama yapar.
4 seferde bulunmadiysa puani 0 verir ve programi sonlandirir.
 */
public class Tren {  // Tren class i olusturur.
    public static void main(String[] args) {
        System.out.println("Lütfen 1 ile 10 arasinda bir tahminde bulununuz.( Toplam 4 hakkiniz vardir.)"); // consola yazi yazdirir
        Scanner vagonTahmini = new Scanner(System.in);  // consoldan bilgi ister
        int tahmin = vagonTahmini.nextInt(10);  // girilen degeri int tipine cevirir
        if (tahmin < 11 && tahmin > 0) {  // eger girilen deger istenilen aralikta degilse program calismaz
            for (int i = 100; i >= 25; i-=25) { // 4 kez donguye girer
                if (tahmin == Vagon.kacaginVagonu) { // girilen deger ile vagon classindaki rastgele olusturulan deger kiyaslanir
                    System.out.println("Tebrikler. Bildiniz.. Puaniniz : " + i ); // degerler birbiriyle ayniysa consola yazi ve puani basar
                    break;
                } else if ( i != 25 && Vagon.kacaginVagonu > tahmin) {
                    System.out.println("Malesef arka vagonlarda. Bir tahmin daha.. ");// girilen degere gore yonlendirme yapar ve bir deger daha girmesini ister
                    tahmin = vagonTahmini.nextInt(10);
                } else if (i != 25 && Vagon.kacaginVagonu < tahmin){
                    System.out.println("Malesef on vagonlarda. Bir tahmin daha.. ");  // girilen degere gore yonlendirme yapar ve bir deger daha girmesini ister
                    tahmin = vagonTahmini.nextInt(10);
                }
                else {
                    System.out.println("Malesef bulamadiniz. Hakkiniz bitti. Puaniniz : " + 0); // tahmin sayisi bitince bilgl verir ve programi bitirir
                }
            }
        }
    }
}
