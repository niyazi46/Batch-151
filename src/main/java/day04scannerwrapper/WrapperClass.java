package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive : char          - boolean - byte - short - int     - long - float - double
        //wrapper Class : Character - BOOLEAN - Byte - Short - Integer - Long - Fload - Double


         //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //Dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz

        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez

        int n = 12;
        //m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir

        Integer m = 12;

        byte p = 33;

        Byte r = 44;
        //Ornek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        Short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        Short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);
        //Ornek 2: int data typ inin minimum degeri ile byte data type nin maximum degerinin tamamini bulunuz
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //Ornek 3: Primitive int i wrapper Integer a ceviriniz.(Autoboxing)
        int num = 12;
        Integer wrapperNum =num;

        //Ornek 4 : Wrapper Byte i primiive byte a ceviriniz. (Unboxing).
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz.(Autoboxing)
        char inital = 'm';
        Character initialWrapper = inital;

        //Ornek 6 : Wrapper Boolean i primitive boolean a ceviriniz(Unboxing)
        Boolean isOldWraper = true;
        boolean isOldprimitive = isOldWraper;










    }
}
