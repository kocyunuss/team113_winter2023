package day06_bagimsizIfCumleleri;

public class C01_ifStatements {


    public static void main(String[] args) {


        /*

             Buradaki şartlar birbirinden bağımsızdır

             uygun sayılar olursa 3 if badisi de çalışabilir
             bazen de hiçbir if body'si devreye girmeyebilir

         */


        int a = 200;

        int b = 130;

        if (a>b) {

            System.out.println("a b den büyük");

        }

    if (a%2==0) {

        System.out.println("a çift sayıdır");

    }

if (b>100) {
    System.out.println("b 100'den büyüktür");
}


boolean sonuc = a*7 > b;

/*

bazen if statement da direl boolean bir değer şart olarak yazılabilir
bu durumda boolean variable değeri true ise if body çalışır,
false ise if body çalışmaz

 */


if (sonuc){

    System.out.println("istenen şart sağlandı");
}






    }

}
