package com.patterns.creationals.factory;

public class Television implements MedioComunicacion{


    @Override
    public void publicarNoticia(String noticia) {
        System.out.println("tv: " + noticia);

    }
}
