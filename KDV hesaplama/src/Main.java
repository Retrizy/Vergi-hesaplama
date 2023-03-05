import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        //Değişkenlerimizi tanımladık.
        double tabanFiyat,vergisizFiyat,kdvOrani,vergiFiyati,vergiliFiyati;
        //Kullanıcıdan taban fiyatı istedik.
        System.out.println("Lutfen taban fiyati giriniz.");
        tabanFiyat = input.nextDouble();
        System.out.print("Taban Fiyat = ");
        System.out.println(tabanFiyat);
        kdvOrani = (tabanFiyat > 0) && (tabanFiyat <= 1000) ? 0.18 : 0.08;
        vergisizFiyat = tabanFiyat;
        vergiFiyati = vergisizFiyat*kdvOrani;
        vergiliFiyati = vergiFiyati + tabanFiyat;
        System.out.print("Vergili fiyatı = ");
        System.out.println(vergiliFiyati);
        System.out.print("KDV fiyatı = ");
        System.out.println(vergiFiyati);
    }
}