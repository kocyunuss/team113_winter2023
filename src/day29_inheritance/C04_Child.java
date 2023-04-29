package day29_inheritance;

public class C04_Child extends C03_ParentClass {
    int c = 20;
    int a;

    String s = "Child Class";
    String m;
    public void method1(){

        System.out.println("child class method1");
    }

    public static void main(String[] args) {



       C03_ParentClass objC3 = new C03_ParentClass();

     objC3.a = 20;
     objC3.b = 22;
     objC3.s = "p";
     objC3.t = "k";
     objC3.method1();
     objC3.method2();


     C04_Child obj4 = new C04_Child();
     obj4.a = 50;;
     obj4.c=20;
     obj4.s="u";
     obj4.m="l";
     obj4.method1();


     //C04 clasını C03'e child yapınca
     // child class'da olmayıp, parent class'da olan
     // b, t ve method2 özellik olarak objC04'e eklendi
     obj4.b=8;
     obj4.t="y";
     obj4.method2();// Parent method2 çalıştı



     /*
           Java' da parent class'lar child edinmez
           child class'lar parent edinir


          Bir classın başka bir classda ki tüm özelliklerini otomatik olarak
          edinmesini istiyorsak classımızı extends keyword ile o classa child yaparız
          (size baba diyebilir miyim // sizi parent yaptım)


      */



    }




}
