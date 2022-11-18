package com.example.javadersleri.nesne_tabanli;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev2 = new Odev2();
        double mileSonuc = odev2.soru1(15);
        System.out.println(mileSonuc);

        odev2.soru2(3,4);

        int faktoriyelSonuc = odev2.soru3(6);
        System.out.println(faktoriyelSonuc);

        odev2.soru4("bu cümlede kaç tane e harfi vardır inceleyelim");

        System.out.println("-----------------------------------------");

        int icAci = odev2.sayfa2soru1(5);
        System.out.println(icAci);

        int toplamMaas = odev2.sayfa2soru2(20);
        System.out.println(toplamMaas);

        int otoparkUcreti = odev2.sayfa2soru3(7);
        System.out.println(otoparkUcreti);
    }
}
