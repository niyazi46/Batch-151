package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kllanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bes basamakli bir sayi giriniz");
        int number = input.nextInt();


        //Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalanini almaliyiz
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        // bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tamsayi yapar
        // java bir yuvarlama yapmaz, ondalik kısmı iptal eder
        // dolayisiyle bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakamini al

        int birlerBasamagi = number % 10;

        //sayi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int sondanIkinci = number % 10;

        //sayi kucult
        number = number % 10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number % 10;
        //sayi kucult
        number = number % 10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number % 10;
        number = number % 10;

        //sndan besinci rakami al
        int sondanBesinci = number % 10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci + sondanDorduncu + birlerBasamagi + sondanIkinci);

      /*
        //Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin 3,5,7 icin ortalama (3+5+7)/3=5
        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        ornegin => 312 icin 3+1+2
       */















    }
}
