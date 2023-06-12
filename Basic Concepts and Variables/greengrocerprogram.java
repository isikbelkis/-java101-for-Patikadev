import java.util.Scanner;

public class greengrocerprogram {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int kilo;
        //armutkilo=2.14, elmakilo=3.67, muzkilo=0.95, patlıcankilo=5,domateskilo=1.11
        int armutkilo, elmakilo, muzkilo, patlicankilo,domateskilo;
        double toplam;
        
        System.out.println("Elma kaç kilo olacak:");
        elmakilo=scan.nextInt();
        
        System.out.println("Armut kaç kilo olacak:");
        armutkilo=scan.nextInt();
        
        System.out.println("Muz kaç kilo olacak:");
        muzkilo=scan.nextInt();
        
        System.out.println("Patlıcan kaç kilo olacak:");
        patlicankilo=scan.nextInt();
        
        System.out.println("Domates kaç kilo olacak:");
        domateskilo=scan.nextInt();
        
        toplam=(domateskilo*1.11)+(elmakilo*3.67)+(armutkilo*2.14)+(muzkilo*0.95)+(patlicankilo*5);
        System.out.println("Toplam Tutar:"+toplam);
    }
}
