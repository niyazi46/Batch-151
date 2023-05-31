package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    java' da method nasil olusturulur?
            1)main method'un disinda olusturulur
            2)Access Modifier + Return Type + Method ismi + () + {}

    Olusturulan methodlar nasil kullanilir?
            1)main method 'un icinden kullanilin
            2)method'un ismi + () yazin
            3) Islem yapacaganz parametreleri parantez icine koyun
*/
    public static void main(String[] args) {
    int sonuc =  toplamaYap( 3, 5);
        System.out.println(sonuc);

     long carpmaSonuc =   multiply();
        System.out.println(carpmaSonuc);

       int ucluSonuc = fistTwoMultiplyThirdAdd();
        System.out.println(ucluSonuc);
        System.out.println(getCube());

        print("Hello world");
        print("hamit");

    }
    //Ornek 1: toplama islemi yapan bir method olusturunuz
   public static int toplamaYap (int a, int b){
     return   a+b;
   }
   //Ornek 2: 2 sayiyi carpma yapan bir methot olusturunuz
    protected static long multiply(){
        return 3 * 6;
    }
    // Ornek 3: verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method u olusturunuz
    private static int fistTwoMultiplyThirdAdd() {
        return 2 * 3 + 4;
    }

        //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan method u olusturup kullaniniz
        //NOTE: ACCESS MODFİER' I default YAPMAK icin acces modifier YAZMAYİNİZ
    static double getCube(){
        return (double) 5 * (double) 5 * (double) 5;
}


     //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print (String str){
        System.out.println(str);
    }
    //methodun return type'i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data uretmiyor ise return void olur




}
