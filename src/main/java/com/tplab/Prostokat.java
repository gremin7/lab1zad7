package com.tplab;


public class Prostokat extends AbstractKsztalt
{
    private final double bok1;
    private final double bok2;
    @Override
    public double policzPole() {
        return bok1*bok2;
    }

    @Override
    public double policzObwod() {
        return (bok1+bok2)*2;
    }
    public Prostokat(String nazwa,double bok1,double bok2){
        super();
        this.nazwa = nazwa;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

}
