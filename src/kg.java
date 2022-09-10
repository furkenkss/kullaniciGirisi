import java.util.Scanner;

public class kg {
    public static void main(String[] args) {
        String kullaniciAdi, sifre,yeniSifre;
        int secim;

        //kullanıcı adı ve şifre kullanıcıdan alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifreniz: ");
        sifre = input.nextLine();

        //Girdilerin doğru olup olmadığı kontrol edilir
        boolean kullanici= kullaniciAdi.equals("furkenkss");
        boolean sifresi = sifre.equals("Turhan");

        //Başarılı giriş işlemi
        if (kullanici ==true && sifresi == true)
            System.out.println("Doğru! Giriş yapıldı");

            //Şifre yanlış girilmesi durumunda yapılacaklar
        else if(kullanici ==false || sifresi == false) {
            System.out.print("Şifreniz yanlış.Şifrenizi sıfırlamak istiyorsanız 1'e basınız.\nCıkış yapmak istiyorsanız 0'a basınız ");
            secim =input.nextInt();

            switch(secim) {
                case 0:
                    System.out.println("Sistemden çıkıldı");
                    System.exit(0);

                case 1 :
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Oluşturmak istediğiniz yeni şifrenizi giriniz:");
                    yeniSifre=inp.next();

                    if(yeniSifre.equals("Turhan")) {
                        System.out.println("Şifreniz eski şifrenizden farklı olmalıdır\nLütfen tekrar deneyiniz");
                    }
                    else {
                        System.out.println("Şifreniz değiştirildi.Yeni şifreniz:"+yeniSifre);
                    }

                    break;
            }
        }

        //Kullanıcı adı yanlış girilmesi durumu
        else
            System.out.println("Kullanıcı bulunamadı..");
    }
}
