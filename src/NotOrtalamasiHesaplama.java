import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        //Değişkenleri Tanımlayalım
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // input için Scanner Nesnesi Oluşturalım

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri isteyelim
        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        // Girilen norların ortalamasını hesaplayalım

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız: " + ortalama );

        //60 ortalama altının geçtiğini 60 üstü ortalamanın kaldığını gösterelim

        String gectiKaldiOrtalama = ortalama >=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(gectiKaldiOrtalama);
    }
}
