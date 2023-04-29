package day13_methodOlusturma;

public class C05_stringiTerseCevirme {

    public static void main(String[] args) {

        // verilen bir Stringi tersine cevirip
        // bize döndüren bir method oluşturun

        System.out.println(stringTersineCevir("Java candır"));


    }

    public static String stringTersineCevir(String metin){
        
        
        String tersMetin = "";

        for (int i = metin.length(); i >= 0; i--) {

            tersMetin+= metin.charAt(i);

        }
        
        return tersMetin;
        
    }



}
