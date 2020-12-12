package ch.hicoders.jam101.week01.ciftci;

import ch.hicoders.jam101.week01.ciftlik.Inek;
import ch.hicoders.jam101.week01.ciftlik.Tavuk;

public class Ciftci {

    public static void main(String[] args) {
        Tavuk birinci_tavuk = new Tavuk("cilli");
        Tavuk ikinci_tavuk = new Tavuk(null);
        System.out.println("Tavuk.count : " + Tavuk.count);
        System.out.println("Birinci Tavuk : " + birinci_tavuk.getName());
        System.out.println("Ikinci Tavuk : " + ikinci_tavuk.getName());
    }
}
