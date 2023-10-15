package com.tplab;

/**
 * Prosty program z użyciem Maven,git,UML,checkstyle,PMD
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        AbstractKsztalt ksztalt = new Prostokat("pr_2",15.0,3.0);
        AbstractKsztalt ksztalt1 = new Kolo("kolo_1",5.0);

        System.out.println("Pole: "+ksztalt.nazwa+" "+ksztalt.policzPole());
        System.out.println("Obwod: "+ ksztalt.nazwa+" "+ksztalt.policzObwod());
        System.out.println("Pole: "+ ksztalt1.nazwa+" "+ksztalt1.policzPole());
        System.out.println("Obwod: "+ ksztalt1.nazwa+" "+ksztalt1.policzObwod());

    }
}
