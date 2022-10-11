import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username , password , newpassword ;
        int quit=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        username = input.nextLine();

        System.out.print("şifreniz: ");
        password = input.nextLine();

        if (username.equals("dilruba") && password.equals("00000")){
            System.out.println("Giriş yapıldı.");
        }
        else {
            System.out.println("Bilgileriniz yanlış." +
                    "Şifreni sıfırlamak için 1 çıkmak için 2 e basınız.");
            quit= input.nextInt();
            switch (quit){
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newpassword = input2.nextLine();
                    if (newpassword.equals("00000")){
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkışınız yapılıyor...");
                    break;
                default:
                    System.out.println("Yanlış seçenek lütfen tekrar deneyiniz.");
            }

        }

    }
}
