package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

        // soru 1 - kullanıcıdan sayi isteyin
        // sayıyı kontrol edip 5 ile bölünebiliyorsa " sayı 5 in tam katı"

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");

        int sayi = scan.nextInt();

        if (sayi % 5==0){

            System.out.println("sayı 5 in tam katı");
        }


if (sayi %3 == 0) {
    System.out.println("3 ile bölünebiken sayı");
}



    }


}
