package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
     //Ornek 2: Kulanicidan ilk ismini ve soy ismini alıp ikisini aynı satirda ekrana yazdiriniz

        // 1.adim: scenner class tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //2.adim: Kullaniciya ne istediğinize dair mesaj veriniz
        System.out.println("ilk isminizi giriniz");

        //3.adim: Uygun method u kullanarak
        //next() method u kullanicidan tek kelimeli string almak için kullanilir
       String firstName = input.next();

        System.out.println("Soy isminizi giriniz");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);


    }
}
