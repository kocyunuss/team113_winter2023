package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfElseIf {

    public static void main(String[] args) {

        // sayı 3 ile pozitif bölünebiliyorsa 3 'ün katı

        // sayı 5 ile bölünebiliyorsa 5'in katı

        // sayı hem 3 hem 5 ile bölünebiliyorsa 3 ve 5 in katı yazdırın

        // ikisine de bölünemiyorsa ne 3 ün ne 5 in katı yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı girin");
        int num = scan.nextInt();


        if (num%3 == 0 && num%5 == 0){
            System.out.println("3 ün  ve 5 in katı");
        }else if (num%5 == 0){
            System.out.println("5 in katı");
        } else if (num%3 ==0 ) {
            System.out.println("3 ün katı");
        }else {
            System.out.println("3 ün ve 5 in katı değil!");
        }

        /*

            eğer bir ef else if ... cümlesi
            else ile bitiyorsa
            MUTLAKA if body lerinden birtanesi çalışır



         */

    }



}
