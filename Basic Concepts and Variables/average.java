import java.util.Scanner;


public class average {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            ;        
                    int mat,fizik,kimya,biyo;
                    
                    System.out.println("Matematik Notunuz:");
                    mat=scan.nextInt();
                    System.out.println("Fizik Notunuz:");
                    fizik=scan.nextInt();
                    System.out.println("Kimya Notunuz:");
                    kimya=scan.nextInt();
                    System.out.println("Biyoloji Notunuz:");
                    biyo=scan.nextInt();
                    
                    int toplam=(mat+fizik+kimya+biyo);
                    int ortalama=toplam/4;
                    System.out.println("Ortalamanız:"+ortalama);
        }
            
    }


}
