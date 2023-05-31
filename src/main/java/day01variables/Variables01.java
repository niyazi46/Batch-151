package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //java bu satiri okumaz. kendimize veya baskasina aciklamadir.
        /* java bu satiri da okumaz

         */
        //variable olusturma
        //data type + variable name + atama operatoru + dat + noktali virgul

        int          age                    =           13           ;


             //java cumlesi==> Statament
        //Eger variable Declaration yapar, assigment yapmazsaniz Java kend degerini (default==>varsayilan)koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise java daki noktalivirgul odur. ve statement in bittigini goserir
        //java da esittir demek "==". Yani Matematikte "=" Java da "=="

        /*
        Java da temelde iki tip data vardir.
        1) primitive data type:
        char, boolean, byte, short, short, int, float, double
        2)non-primitive data type:
            String
         */

          //Ornek 1: Ogrenci ismi icin bir variable olusturup deger olarak Ali Can atayiniz
        //string'lerde verilen degerler daima çift tirnak içinde olmalidir

        //String bir variable olusturup ona herhangi bir atama yapmazsak java o variable a
        //default olarak "null" koyar
        //nul demek 0 demek degildir. 0 da coding te bir degerdir.
        //null demek ici bos bir obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir.
        //{}

        //char data type:
        //Tek karakterler icin kullanilir. ornegin==> A, x, ?, 5
        //Ornek1: char data type'inda bir ismin ilk harfi olarak bir variable olsuturunuz ve bir deger atayiniz.
        //Note: char data type'inde degerler tek tirnak icinde kullanilir.
        char isminİlkHarfi= 'A';

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir. true(dogru) yada false (yanlis)
        //Ornek 3: boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin.

        boolean emeklimisin = false;

        //byte data type:
        //tam sayilar icindir hafizada bir byte (sekiz bit) yer kaplar
        // byte: -128 den +127 ye kadar tamsayi degerleri icin kullanilir
        //Ornek 4: byte data typ'inda ogrenci yasi icin bir veriable olusturunuz ve deger atayiniz.
        byte studentAge = 23;



        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile +32767 arasindaki tamsayilar icin kullanilir.
        //Ornek 5 : site nufusu icin bir variable olusturun ve deger atayiniz.
         short siteNufusu = 1200;

         //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar.
        // int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6: Ulke nufuısu icin bir veriable olusturun ve deger atamasi yapiniz

        int countryPopulation = 186478463;

        //long data type:
        //tam sailar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 7: insan vucundaki hucre sayisi icin veriable olusturup deger atamasi yapiniz

        long cellNumberHumanBody = 87878787848481818L;

        //Eger atadiginiz deger int'lerin araliginda ise sonuna 'L' koymaya gerek yok
        //long demenize ragmen L koymazsak eger int araliginda ise java onu int kabul eder

        long weithOfSun = 1354654L;

        //float data type:
        //float data tipi Virgullu sayilar(ondalikli saylar==> Decimal Numbers) icin kullanilir
        //float hafizada 4 byte yer kaplar
        //Note: java da ondalikli sayilar yani " Decimal Numbers" i otomatik olarak "double" kabul eder
        //eger float data type'i olmasinda israr ederseniz sonuna "F" koymalisiniz

        //Ornegin fiyatlandirmalar icin tercih edilir (12.99)
        //Ornek 8: Gomlek ve ayakabi fiyatlari icin iki tane veriable olusturup toplam fiyati ekrana yazdiriniz

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice+shoesPrice);
        //System.out.println(); yazdirmanin kisayolu ==> sout yaz enter a bas

        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);


        //System.out.println(); ekrana yazdirir be bir sonraki satira koyar
        //System.out.println(); ekrana yazdirir ve pointer i ayni satirda tutar.


        //double data type:

        //double data tipi Virgullu sayilar (Ondalikli sayilar ==>Decimal Numbers) icin kullanilabilir
       //double memoryde daha fazla yer kaplar, virgulden sonraki rakam daha fazla alir
        //ornek 9: Hucrenin agirligi ve Amip in agirligi icin iki tane veriable olusturun ve agirlik farkini consol a yazdirin

        double weightCell = 0.0000000000000112;
        double weightAmip = 0.0000000000000023;

        System.out.println(weightCell - weightAmip);








    }

}
