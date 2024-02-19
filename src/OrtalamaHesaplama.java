import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        int topNot = mat + fizik + kimya + turkce + tarih + muzik;
        double ortNot = topNot/6;
        System.out.println("Not ortalamanız: " + ortNot);

        String sonuc = (ortNot>=60)? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.println(sonuc);

    }
}
