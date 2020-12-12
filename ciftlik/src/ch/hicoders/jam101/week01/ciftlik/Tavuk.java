package ch.hicoders.jam101.week01.ciftlik;

public class Tavuk {
    private String name;
    public static int count = 0;
    public Tavuk(String pName){ // constructor
        this.name = pName;
        count++; // count = count + 1;
        if(pName == null){
            this.name = "Tavuk" + count;
        }
    }
    public String getName(){
        return this.name;
    }
}
