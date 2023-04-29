package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

       // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üçgenin 3 kenar uzunluğunu girin : ");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        // java da üçlü karşılaştırma yoktur ikili karşılaştırma yapabiliriz

        if (kenar1 == kenar2 && kenar1==kenar3 && kenar2==kenar3) {
            System.out.println("eşkenar üçgen");


        }


    }

}
