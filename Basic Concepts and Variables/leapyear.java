import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = input.nextInt();

        if(year % 4 == 0 && year % 100!=0 || year % 400==0){
            System.out.print(year + " a leap yer.");
        }
        else{
            System.out.println(year + " not a leap year.");
        }
    
    
}
