package day05concatinationoperatorstypecasting;

public class AssciiValues {
    public static void main(String[] args) {
        /*
        java da her karakterin sayisal bir degeri vardir.
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII table denir
         */
        char a = 'a';//a
        System.out.println(a);

        int intA = 'a';
        System.out.println(intA);//97

        //Herhangi bir character in ASCII degerini bulmak icin o karakter i "int" data typ inda bir veriable icine koyun

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1 + c2);//138
        //java da char lari matematilsel islemlerde kulanirsaniz , jaca char larin ASCII degerlerini kullanir.
    }
}
