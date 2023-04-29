package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

        /*
            ifstatements da şart parantezinden sonra {} kullanmazsak java ilk ; ' e kadar olan kısmı
            if body olarak kabul eder

            if body zaten bir satır ise bu bir sorun olmaz ama if body 1 satırdan çoksa ilk satırdan sonrası her durumda
            çalışır

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notu girin : ");
        double not = scan.nextDouble();

        if (not>=50 && not<=100) {
            System.out.println("sınıfı geçtin");
        }

        if (not<=50) {
            System.out.println("sınıfta kaldın!");
        }









    }

}
