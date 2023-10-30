import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int sonuc = hesapla(sayi);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int hesapla(int sayi) {
        if (sayi <= 0) {
            System.out.println("Sayı 0 veya negatif olduğu için 5 ekleniyor. Yeni sayı: " + (sayi + 5));
            return hesapla(sayi + 5);
        } else {
            System.out.println("5 çıkartılıyor. Yeni sayı: " + (sayi - 5));
            if (sayi - 5 <= 0) {
                System.out.println("Sayı 0 veya negatif olduğu için 5 ekleniyor. Yeni sayı: " + (sayi - 5 + 5));
                return sayi - 5 + 5;
            } else {
                return hesapla(sayi - 5);
            }
        }
    }
}