package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz ==> Kisa kena * Uzun kenar
        //b) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();

        System.out.println("ikdorgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+(shortSide*longSide));

        System.out.println("Cevre = "+(2*shortSide+2*longSide));


    }
}
