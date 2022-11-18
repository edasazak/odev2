package com.example.javadersleri.nesne_tabanli;

public class Odev2 {
    public double soru1(double km) {
        double mil = km*(0.621);
        return mil;
    }
    public void soru2(double kisaKenar,double uzunKenar){
        double alan = kisaKenar*uzunKenar;
        System.out.println(alan);
    }
    public int soru3(int sayi) {
        int fact = 1;
        for (int i = sayi; i > 1; i--) {
            fact = i * fact;
        }
        return fact;
    }

    public void soru4(String kelime){
        int sayi = 0;
        char eHarfi = 'e';
        for(int i = 0; i<kelime.length();i++){
            if(kelime.charAt(i) == eHarfi){
                sayi++;
            }
        }
        System.out.println(sayi);
    }
    //---------------------------------------------
    public int sayfa2soru1(int kenarSayisi){
      int icAciToplam = ((kenarSayisi-2)*180) / kenarSayisi;
      return icAciToplam;
    }

    public int sayfa2soru2(int gunSayisi){
        int calisilanSaat;
        int saatUcreti = 40;
        int mesaiSaat=0;
        int mesaiSaatUcreti = 80;
        int maas;
        calisilanSaat = gunSayisi*8;
        if(calisilanSaat>150){
            mesaiSaat = calisilanSaat - 150;
            maas = ((calisilanSaat-(mesaiSaat))*saatUcreti) + (mesaiSaat*mesaiSaatUcreti);
        }else {
            maas = calisilanSaat*saatUcreti;
        }
        return maas;


    }
    public int sayfa2soru3(int otoparkSuresi){
        int ucret = 0;
        int saatUcret = 50;
        int asilanSaatUcret = 10;
        int asilanSaat;
        if(otoparkSuresi>1){
            asilanSaat = otoparkSuresi - 1;
            ucret = (saatUcret*(otoparkSuresi - asilanSaat)) + (asilanSaatUcret*asilanSaat);
        }else {
            ucret = saatUcret*otoparkSuresi;
        }
        return ucret;
    }
}
