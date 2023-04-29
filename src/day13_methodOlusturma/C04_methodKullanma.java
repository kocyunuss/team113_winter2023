package day13_methodOlusturma;

import java.util.Scanner;

public class C04_methodKullanma {

    public static void main(String[] args) {



        //kullanıcıdan 10 küüçk iki pozitif sayı alıp
        // faktöriyel değerlerini toplayın


        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan küçük 2 adet pozitif tam sayı girin : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        int sonuc = C03_Faktoriyel.faktoryelHesapla(sayi1) +
                   C03_Faktoriyel.faktoryelHesapla(sayi2);



    }









}

