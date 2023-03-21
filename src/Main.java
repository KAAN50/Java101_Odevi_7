import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, sifre2;
        int secim;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = input.next();

        System.out.println("Şifrenizi Giriniz: ");
        sifre = input.next();

        if (kullaniciAdi == "kaan" && sifre == "KS12") {
            System.out.println("Kullanıcı Adı Ve Şifreniz Doğru! Hoşgeldiniz");

        } else {
            System.out.println("Hatalı Kullanıcı Adı Veya Şifre Girişi!  Lütfen Tekrar Deneyiniz");

            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ? İstemiyorsanız -1 İstiyorsanız - 2 ");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("İşleminiz sonlandırıldı.");
                    break;

                case 2:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    sifre2 = input.next();
                    if (sifre2 != sifre) {
                        System.out.println("Şifreniz oluşturulamadı tekrar deneyiniz.");
                    } else {
                        System.out.println("Şifreniz başarıyla oluşturuldu.");
                    }
                    break;
            }
        }
    }
}