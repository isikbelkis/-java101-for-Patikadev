import java.util.Scanner;

public class userlogin {
    Scanner scan=new Scanner(System.in);
    String userName,password;
        System.out.println("Kullanıcı adını giriniz:");
        userName=scan.nextLine();
        System.out.println("Parola giriniz:");
        password=scan.nextLine();
        
        if(userName.equals("123456")&& password.equals("896523")){
            System.out.println("Giriş başarılı");
            
        }else {
            System.out.println("Kullanıcı adı veya parola hatalı");
            
        }
    
}
