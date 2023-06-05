import java.util.Scanner;

public class VatAmountCalculatorProgram {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
        double tutar, kdvtutar=0.18, kdvtutar1=0.8,kdvlifiyat;
        System.out.println("Ürünün fiyatını giriniz:");
        tutar=scan.nextDouble();
        if(tutar<1000){
            kdvlifiyat=tutar+(tutar*0.18);
            System.out.println("Ürünün kdvli fiyatı:"+kdvlifiyat);
            
        }else if(tutar>=1000){
            kdvlifiyat=tutar+(tutar*0.08);
            System.out.println("Ürünün kdvli fiyatı:"+kdvlifiyat);
    

    }   
}   