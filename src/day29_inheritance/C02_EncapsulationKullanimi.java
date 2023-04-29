package day29_inheritance;

public class C02_EncapsulationKullanimi {

    public static void main(String[] args) {


        C01 obj = new C01();

        obj.isim = "Yunus";
        System.out.println(obj.isim);

        obj.setSayi(40);
        System.out.println(obj.getSayi());


    }

}
