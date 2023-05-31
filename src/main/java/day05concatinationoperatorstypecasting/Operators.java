package day05concatinationoperatorstypecasting;

public class Operators {
    /*
    1)+, -, * , / islemleri java da matematik te kullanildigi gibi kullanilir.
    Note 1 : int / int => int olur
    Note: double + int ==> double olur
    Cunku java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman buyuk data type inda olur

    2) java da "Logical Operator" lar vardir. AND VE OR islemleri Logical operatorlardir. ör CAY AND KAHVE SONUC
    İ) AND (&&) isleminde true alabilmek icin her sey true olmalidir.
    AND islemi "perfectionist" tir
    AND isleminde bir tane false sonucu false yapar
    ii) OR isleminde (||) bir tane true yapmaya yeter
    OR isleminde sonucun false olmasi icin hersey false olmalidir
    OR islemi "polyanna" gibidir.

    iii)Not operator (!) true olani false, false olani true yapar
    ! true ==> false
    !false ==> true
    !!true ==> true
  3)Comparison (Karsilastirma) Operators
            <,>,<=,>=,==,!=
       Note: Karsilastirma operatorleini kullandiginizda kesinlikle boolean (true veya false alirsiniz)

       NOTE : biz AND islemi icin && kullaniriz ama & kullanimda gecerlidir
           fark nedir ?
           && kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir
           cunku and isleminde ilk ifade false ise digerlerinin ne oldugunun bir onemi yoktur sonuc false olur
           & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir
           bu yuzden biz hep && kullaniriz.

           */
    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3 != 5;
        System.out.println(first+ " - "+ second + " - "+ third); //true - false - false


        System.out.println(first && second);
        System.out.println(first || second || third);

    }
}
