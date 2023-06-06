import java.util.Scanner;

public class Hypotenuse {
    Scanner scan=new Scanner(System.in); 
        int a, b;
        double c;
        System.out.println("1. Kenarı giriniz:");
        a=scan.nextInt();
        System.out.println("2.Kenarı giriniz:");
        b=scan.nextInt();
        
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+c);
}
