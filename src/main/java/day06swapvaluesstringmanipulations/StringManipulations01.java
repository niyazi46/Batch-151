package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir class dir.
        String s= "Java is easy";


        //Ornek 1: "s"Stringindeki tumnkarakterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Ornek 2:  "s"Stringindeki tumnkarakterleri kucuk harf yapiniz
        String sLover =s.toLowerCase();
        System.out.println(sLover);

        //Ornek 3: "s" Stringindeki ilk characteri aliniz.
        char firstChar= s.charAt(0);
        System.out.println(firstChar);//J

        //ornek 4: "s" stringindeki bastan ikinci ve sondan ikincicharacteri aliniz ve ekrana yazdiriniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println(""+secondChar+ secondLastChar);//as

        //Ornek 5: "s" stringinde kullanilan character sayisini bulunuz
       int sLent= s.length();
        System.out.println(sLent);//12

        //Ornek6: "s" String'indeki ilk 4 cracteri aliniz
        //s.substring(0,4); ==> bu kullanimda ilk index dahildir, ikici index harictir.
        String sun1 = s.substring(0,4);
        System.out.println(sun1);//Java

        //Ornek 7: "s" Stringindeki "is" kelimesini aliniz
        String sun2 = s.substring(5,7);
        System.out.println(sun2);

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz

        String sun3 = s.substring(8,12);
        System.out.println(sun3);

        //ikinci yol
        String sun4 = s.substring(8);
        System.out.println(sun4);//easy

        //Ornek 8 : "s" String'inde "money" kelimesinin var olup olmadiğini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        //Ornek 10: "s" String' inin belli bir harf veya harflerle baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ornek11: "s" Stringinin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini
        //kontrol eden kodu yaziniz
        boolean isBegin =s.startsWith("i", 5);
        System.out.println(isBegin);






    }
}
