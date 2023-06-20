package perfectNumber;

import java.util.Scanner;


public class perfectNumber {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,k, counter=0;
        System.out.println("Bir sayı giriniz:");
        i=scan.nextInt();
        for(int a=1;a<=i;a++){
            if(i%a==0){
                counter+=a;
            }
    }   if(counter==2*i){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
    }   else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");
    }

}
}