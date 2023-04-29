package day13_methodOlusturma;

import java.util.Scanner;

public class C02_ikiSayıyıToplamaMethodu {

    public static void main(String[] args) {



        //kullanıcıda iiki sayı alıp
        // toplamlarını yazdıran bir method oluşturun

ikiSayiTopla();




    }

         public static void ikiSayiTopla(){

        Scanner scan = new Scanner(System.in);
        System.out.println("toplamak üzere iki sayı girin");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

    System.out.println("iki sayının toplamı : " + (sayi1+sayi2));



}





}
