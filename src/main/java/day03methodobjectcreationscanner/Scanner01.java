package day03methodobjectcreationscanner;

//Javanin util kutuphanesinden scanner class import edildi.


   import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adim Scanner Class tan object olusturur
        Scanner input = new Scanner(System.in);


        //2.adim kullaniciya ne istediğinize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim. Uygun method u kullanarak Kullanicinin verdigi data yi memory e yerlestiriniz
        byte age = input.nextByte();
        System.out.println("age = " + age);


    }
}
