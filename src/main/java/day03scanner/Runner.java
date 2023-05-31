package day03scanner;

public class Runner {
    public static void main(String[] args) {

      //Objeck nasil olusturulur ?
      //Class ismi + Object ismi + Atama operatoru + "new" + Constructor
           Car         myCaR            =             new       Car();
           //"new" keyword'u sıfırdan yeni bir obje olusturmak icin kullanilir.
        //Constructor Java'da nesneleri olsuturmak için kullanilan ozel bir methoddur.
        System.out.println( myCaR.fiyat);
        System.out.println("myCar.model = "+myCaR.model);

        myCaR.hareket();
        myCaR.dur();

        Student tomhanks = new Student();
        System.out.println("tomhanks.name = " + tomhanks.name);
        System.out.println("tomhanks.address = " + tomhanks.address);
        System.out.println("tomhanks.grade = " + tomhanks.grade);
        tomhanks.feed();
        tomhanks.study();
byte grade = tomhanks.grade;
        System.out.println("grade = " + grade);


    }
}
