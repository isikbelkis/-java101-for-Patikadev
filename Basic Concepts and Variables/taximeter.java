import java.util.Scanner;

public class taximeter {
    Scanner scan=new Scanner(System.in); 
        int km;
        double kmBasi=2.28,total, startPrice=10;
        System.out.println("Mesafeyi KM türünden yazınız:");
        km=scan.nextInt();
        
        total=(km*kmBasi);
        total+=startPrice;
        
        if(total<20){
            System.out.println("Ödenecek Tutar:"+20);
        } else if (total>20){
            System.out.println("Ödenecek Tutar:"+total);
        }
        
        
        
    }
        
    

    

