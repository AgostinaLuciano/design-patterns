package com.patterns.creationals.factory;

public class Diario implements MedioComunicacion{


    @Override
    public void publicarNoticia(String noticia) {
         System.out.println("Diario: " + noticia);

    }
}