package com.patterns.creationals.factory;

public class App {
    public static void main (String [] Args){

        CrearMedio c = new CrearMedio();
        c.crearMedio().publicarNoticia("x");
    }
}
