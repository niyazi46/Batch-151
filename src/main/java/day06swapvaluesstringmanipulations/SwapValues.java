package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap : yer degistirmek 1.kap patates 2.kap Domates ==> 1.kapta domates 2. kap patates


        int a = 12;
        int b = 5;//Swaptan sonra ==> a=5, ve b=12;
        int temp=0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1. Adim
        temp = a;
        //2.adim
        a=b;
        //3.adim
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Yol
        int elma =12;
        int armut=5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma+armut;
        armut = elma-armut;
        elma = elma-armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
