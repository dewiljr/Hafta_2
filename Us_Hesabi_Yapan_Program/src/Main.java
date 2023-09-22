import java.util.Scanner;
public class Main {


    static int usalma(int ilkSayi, int ikinciSayi) {
        if (ikinciSayi == 1){
            return ilkSayi;
        }
        else {
            return ilkSayi * usalma(ilkSayi,ikinciSayi-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int givenNumber = inp.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int secondaryNumber = inp.nextInt();

        if (secondaryNumber == 1) {
            System.out.println("Sonuç : " + givenNumber);
        }
            else if (secondaryNumber == 0){
            System.out.println("Sonuç : " + 1);
        }
            else if (secondaryNumber < 0) {
                do {
                    System.out.println("Lütfen negatif üs almayınız!");
                    System.out.print("Lütfen üs değerini tekrar giriniz : ");
                    secondaryNumber = inp.nextInt();

                }
                while (secondaryNumber < 0);
                int a = usalma(givenNumber, secondaryNumber);
                System.out.print("Sonuç : " + a);
            }
        else {
            int a = usalma(givenNumber, secondaryNumber);
            System.out.print("Sonuç : " + a);
        }

    }
}