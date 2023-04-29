package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);




    }

    public static void elementleriArtir(List<Integer> sayilar){

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i, 2*sayilar.get(i));

        }


    }


}
