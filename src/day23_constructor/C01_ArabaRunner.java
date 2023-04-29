package day23_constructor;

public class C01_ArabaRunner {
    public static void main(String[] args) {

        Araba araba1= new Araba();
        System.out.println(araba1);
        araba1.fiyat=1500000;
        araba1.marka="Volvo";

        System.out.println(araba1);

        Araba araba2= new Araba(4000000,"BMW");
        System.out.println(araba2);


    }

}
