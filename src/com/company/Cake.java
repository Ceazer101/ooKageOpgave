package com.company;

public class Cake {

    private int hvedemelGram;
    private int sukkerGram;
    private double kakaoGram;
    private double bagepulverTsk;
    private double vanilijesukkerTsk;
    private double mælkDl;
    private double olieDl;

    public Cake (){
        this.hvedemelGram = 120;
        this.sukkerGram = 120;
        this.kakaoGram = 34;
        this.bagepulverTsk = 2;
        this.vanilijesukkerTsk = 2;
        this.mælkDl = 2;
        this.olieDl = 1.0;
    }

    public double getBake(){

        double samletVægtIngridienser = (hvedemelGram + sukkerGram + kakaoGram
                + bagepulverTsk + vanilijesukkerTsk + mælkDl + olieDl);

        return samletVægtIngridienser;
    }

    public double getBakedCake(){
        double samletVægtIngridienser = (hvedemelGram + sukkerGram + kakaoGram
                + bagepulverTsk + vanilijesukkerTsk + mælkDl + olieDl);
        double samletVægtKage = (samletVægtIngridienser - (samletVægtIngridienser * 10) / 100);

        return samletVægtKage;
    }

    public double getEnergyValue(){
        double hvedemelEnergi = 36 * hvedemelGram;
        double sukkerEnergi = 68 * sukkerGram;
        double kakaoEnergi = 42 * kakaoGram;
        double bagepulverEnergi = 5 * bagepulverTsk;
        double vaniljesukkerEnergi = 9 * vanilijesukkerTsk;
        double mælkEnergi = 26 * mælkDl;
        double oliEnergi = 17 * olieDl;

        double samletEnergi = (hvedemelEnergi + sukkerEnergi + kakaoEnergi
                + bagepulverEnergi + vaniljesukkerEnergi + mælkEnergi + oliEnergi);

        return samletEnergi;
    }

    @Override
    public String toString() {
        return " Den samlede vægt på ingridienserne er " + getBake() +
                "\n Den samlede vægt på den færdiglavede kage " + getBakedCake() +
                "\n Den samlede vægt for energi værdi på kagen er " + getEnergyValue();
    }
}
