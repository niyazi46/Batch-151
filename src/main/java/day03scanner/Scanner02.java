package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    //kullanicidan ilk ismini ve soy ismini alip ayni satirda ekrana yazdiriniz
    public static void main(String[] args) {

        //1.adim : Scanner Class' dan obje olustur
        Scanner input = new Scanner(System.in);

        //2.Adim : kullaniciya ne istedigimize dair mesaj veriniz.
        System.out.println("İlk isminizi giriniz...");
       String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");

      String lastname = input.next();

        System.out.println(firstName +" " + lastname);
    }
}
