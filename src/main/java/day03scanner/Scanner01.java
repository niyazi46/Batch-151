package day03scanner;

//java'nin util kutuphanesinden scanner class inport edildi demektir.
// kütüphaneden sisteme alındı
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adım: Scanner Class'tan bir obje olustur
        Scanner input = new Scanner(System.in);


        //obje ismini input yaptik cunku bu objeckt kullanicidan alinan datayi benim kodlarimin icine koyacak

        //2.adım Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");
        //3.adim uygun method' u kullanarak kullanicinin verdigi data' yı memory e yerlestiriniz
      byte age =  input.nextByte();

        System.out.println(age);
    }
}
