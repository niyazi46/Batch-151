package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini consola yazdirin.
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b); //elma1011 (elma ile 10 toplar sonra 11 le toplar)
        System.out.println(s + (a + b ));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama işlemi olur.
        //Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa "concatination" islemi olur
        //"Concatination" birlestirme yapar
        //Note : Concatination islemlerinde java matematik teki islem önceliği kurallarini kullanir
        /* Matematikte islem onceliği
        1)once uslu sayilar
        2)parantez ici islemler yapilir
        3)carpma ve bolmeler yapilir
        4)toplama ve cikarmalar yapilir
        5)ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2 : Size Strink olarak verilen 2 fiyatin toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() string degerleri intiger a cevirir.
        Integer toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //Ornek 3: Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz


        String tv ="$1100";
        String radio= "$300";
        Integer totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        //Note : valueOf() method u tum karakterleri raka olan Stringleri sayilara cevirir
        //Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.







    }
}
