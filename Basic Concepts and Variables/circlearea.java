import java.util.Scanner;

public class circlearea {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int r;
        double pi=3.14,alan,cevre;
        System.out.println("Dairenin yarıçapını giriniz:");
        r=scan.nextInt();
        alan=(r*r)*pi;
        cevre=(2*pi*r);
        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);
        
    }

}
}
