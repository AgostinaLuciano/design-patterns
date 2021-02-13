package com.patterns.creationals.factory;

public class Radio implements MedioComunicacion{


    @Override
    public void publicarNoticia(String noticia) {
        System.out.println("Radio: " + noticia);

    }
}
