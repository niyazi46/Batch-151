package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    //kullanicidan adresini aliniz ve ekrana yazdiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz...");
        //next() method u kullanicidan tek kelimeli string'i almak icin kullanilir
        //nextLine() method'u ise kullanicidan cok kelimeli Stringi almak icin kullanilir.

        String adress = input.nextLine();
        System.out.println(adress);
    }
}
