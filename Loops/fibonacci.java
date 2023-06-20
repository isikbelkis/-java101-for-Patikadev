import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n=scan.nextInt();
        int s1=0;
        int s2=1;
        int sum1=0;
        for(int i=1;i<=n;i++){
            System.out.println(s1+" ");
            sum1=s1+s2;
            s1=s2;
            s2=sum1;
        }
}
