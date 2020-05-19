package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        /*
        Podstawowa b1 = new Podstawowa();
        b1.f();
        b1.g();

        Pochodna d1 = new Pochodna();
        d1.f();
        d1.g();
        d1.h();

        Podstawowa b2 = new Podstawowa();
        b2.f();
        b2.g();
    }
}

class Podstawowa {
    public void f(){
        System.out.println("f() w Podstawowa");
    }

    public void g(){
        System.out.println("g() w Podstawowa");
    }
}

class Pochodna extends Podstawowa {
    public void g(){
        System.out.println("g() w Pochodna");
    }

    public void h(){
        System.out.println("h() w Pochodna");
    }

}

         */

        /*

        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        kalkulatorPodstawowy.dodaj(5, 7);
        kalkulatorPodstawowy.odejmij(7, 5);

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        kalkulatorStatystyczny.dodaj(5, 7);
        kalkulatorStatystyczny.odejmij(7, 5);
        kalkulatorStatystyczny.sinus(30, 90);
    }
}

class Kalkulator{
    public void dodaj(int a, int b){
        int x;
        x = a + b;
        System.out.println(x);
    }

    public void odejmij(int a, int b){
        int x;
        x = a - b;
        System.out.println(x);
    }
}

class KalkulatorStatystyczny extends Kalkulator{
    public void sinus(double a, double b){
        double x;
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}

         */

    Podstawowa b1 = new Podstawowa();
    b1.wypisz("Hello");

    Pochodna d1 = new Pochodna("Hello");
    d1.wypisz("World");

    }
}

class Podstawowa{
    public void wypisz(String a){
        a = "Hello";
        System.out.println(a);
    }

}

class Pochodna extends Podstawowa{
    String a;
    public void wypisz(String a){
        System.out.println();
    }

    Pochodna(String z){
        super();
        this.wypisz("World");
        System.out.println(z);
    }

}