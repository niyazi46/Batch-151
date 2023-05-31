package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);


        print("Java is easy");

        //Method olusturmak icin ikinci yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz


    }

    //Ornek1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.

     static double getCube(double a) {
        return a*a*a;
    }
    //Note: Access modifier i default yapmak istersdwniz access modifier i YAZMAYİNİZ..
    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print(String str) {
        System.out.println(str);
    }
    //Eger bir method yeni bir data üretmiyorsa return typ i void olur
    //method un return typ i void ise method body icinde return keywordu yazilmaz

    /*
    HOMEVORK
    1) Cemberin cevresini hesaplayan methodu olusturunuz ve kulanınız
    2) Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
     */

}