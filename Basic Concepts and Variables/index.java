import java.util.Scanner;

public class index {
    Scanner scan=new Scanner(System.in);
    double kilo,boy,indeks;
    System.out.println("Boyunuzu metre cinsinden giriniz:");
    boy=scan.nextDouble();
    System.out.println("Kilonuzu giriniz:");
    kilo=scan.nextDouble();
    
    //Kilo (kg) / Boy(m) * Boy(m)
    indeks=kilo/(boy*boy);
    System.out.println("Vücut indeksiniz:"+indeks);

    
}
