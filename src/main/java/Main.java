import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Contex contex=new Contex();
//        Tax taxPl= new TaxPl();
//        contex.setTax(taxPl);
//        ta
        Clienat clienat = new TaxEn();
        clienat.setCena(sc.nextDouble());
        System.out.println(clienat.wyliczPodatek());
        clienat = new TaxPl();
        clienat.setCena(sc.nextDouble());
        System.out.println(clienat.wyliczPodatek());
        System.out.println();
    }
}
