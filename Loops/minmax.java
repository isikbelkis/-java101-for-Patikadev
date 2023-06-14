import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        int n=scan.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=1;i<=n;i++){
            System.out.print(+i +". Sayıyı giriniz:");
            int sayi=scan.nextInt();
            if(sayi<min){
                min=sayi;
            }
            if(sayi>max){
                max=sayi;
            }
        } System.out.println("En büyük sayi:"+max);
          System.out.println("En küçük sayi:"+min);
}
