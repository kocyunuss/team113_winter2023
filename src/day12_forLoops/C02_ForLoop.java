package day12_forLoops;

public class C02_ForLoop {

    public static void main(String[] args) {

     /*   Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
      sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
      Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        */


        int bas = 20;
        int bit = 250;
        int sayiToplamı = 0;
       if (bit<bas){
           System.out.println("başlangıç değeri bitiş değerinden küçük olmalıdır");
       }else {

           for (int i = bas; i<=bit; i++){

               sayiToplamı+=i;
           }

       }


        System.out.println("sayı toplamı : " + sayiToplamı);









    }

}
