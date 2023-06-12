import java.util.Scanner;

public class flightticket {
    public static void main(String[] args){
    Scanner scan=new Scanner (System.in);
    int km,yas;
        double bilet;
        int yolculuktipi;
        
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        km=scan.nextInt();
        
        System.out.println("Kaç yaşındasınız:");
        yas=scan.nextInt();
        
        System.out.println("Yolculuk tipinizi giriniz (gidiş-dönüş=1,tek yön=2):");
        yolculuktipi=scan.nextInt();
        
        if(yolculuktipi==1){
            if(yas<12){
            bilet=km*0.10-0.20*((km*0.10)-(km*0.10)*0.50);
            System.out.println("Ödenecek Tutar:"+bilet);
        } else if(yas>12&&yas<24){
            bilet=km*0.10-0.20*((km*0.10)-(km*0.10*0.10));
            System.out.println("Ödenecek Tutar:"+bilet);

        } else if(yas>65){
            bilet=km*0.10-0.20*((km*0.10)-(km*0.10*0.30));
            System.out.println("Ödenecek Tutar:"+bilet);
        }
        }else if (yolculuktipi==2){
            if(yas<12){
            bilet=(km*0.10)-(km*0.10)*0.50;
            System.out.println("Ödenecek Tutar:"+bilet);
        } else if(yas>12&&yas<24){
            bilet=(km*0.10)-(km*0.10*0.10);
            System.out.println("Ödenecek Tutar:"+bilet);
        } else if(yas>65){
            bilet=(km*0.10)-(km*0.10*0.30);
            System.out.println("Ödenecek Tutar:"+bilet);
        }
    } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
     }
  }
}
