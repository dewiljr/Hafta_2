import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan kontrol için sayıyı alıyoruz

        System.out.println("Kontrol edilecek tam sayıyı giriniz : ");
        int anaSayi = inp.nextInt();

        //burada sayı 1 ya da 1 den küçükse asal değil koşulunu giriyoruz

        if (anaSayi <= 1 ){
            System.out.println("Asal sayı değildir!");
        }

        //aşağıda yaptığımız kontrol sayesinde kontrolümüzün 1den büyük ve kendinden küçük böleni yoksa asal sayı diyoruz

        else if (asalKontrol(anaSayi,2, 0)==0){
            System.out.println("asal kısmı");
        }

        //kalan kısım komple asal sayı olacağından asal değil olarak çıktı alıyoruz.

        else {
            System.out.println("asal değildir");
        }
        }


    static int asalKontrol(int anaSayi, int bolenSayi,int kontrol){
        if (anaSayi > bolenSayi)
        {

            /*eğer kendinden küçük böleni varsa kontrol sayısını büyütüyoruz maksat 0 dan değişik olsun yukarıda
            sıfır koşulunu soruyoruz*/

            if (anaSayi % bolenSayi == 0)
            {
                kontrol++;
                return kontrol;
            }

            //burada eğer 2 ye tam bölünmüyorsa sayıyı 1 büyüterek tekrar döngüye sokuyoruz

            else
            {
                return asalKontrol(anaSayi, bolenSayi+1, kontrol);
            }


        }
        return kontrol;

    }
}
