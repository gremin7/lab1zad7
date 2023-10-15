package com.tplab;

public class Kolo extends AbstractKsztalt {
    private final double promien;
    @Override
    public double policzPole() {
        return Math.PI*promien*promien;
    }

    @Override
    public double policzObwod() {
        return 2*Math.PI*promien;
    }
    public Kolo(String nazwa,double promien){
        super();
        this.nazwa = nazwa;
        this.promien = promien;

    }

}
