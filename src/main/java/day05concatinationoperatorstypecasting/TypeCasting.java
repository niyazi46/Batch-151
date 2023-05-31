package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Muneric primitive data type larinin birbirine donusturulmesine "Type Casting" denir
    Numeric (sayisal) data typelar byte - short - int - long - float - double
     */
    //Note 1: Kucuk data type larini buyuk data typelarine cevirmeyi java otomatik olarak yapar
    // bu isleme "Autowidening" (otomatik genisletme) denir.

    //Note 2: Buyuk data typelarini kucuk data typlarine cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
    //bu islemi kod yazanlardan bekler.
    //Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir

    public static void main(String[] args) {
        //byte data typini int data typina ceviriniz
        byte age = 13;
        int ageInt = age;//Auto Widening

        //int data typeini Short data type ina ceviriniz
        int weight = 312;
        short weihghtShort = (short)weight;//Explicit Narrowing
        //int data type ini float data typina ceviriniz

        int population = 7000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data typini short data type ina ceviriniz
        double number = 12.99;
        System.out.println(number);//12

        short numberShort=(short) number;
        System.out.println(numberShort);//12.99

        short num=260;
        System.out.println(num);

        byte numByte =(byte) num;
        System.out.println(numByte);//4
        //Not
        //Donusum yaptigimiz sayi(260) donusecegimiz data type inin sinirlari disinda ise java kullandiğiniz sayi ie mod islemi yapar ve mod isleminin
        //sonucu sizin yeni degeriniz olur








    }
}
