import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        n = input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
}
}