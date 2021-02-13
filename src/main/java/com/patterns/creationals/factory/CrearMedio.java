package com.patterns.creationals.factory;

public class CrearMedio {
    public static MedioComunicacion crearMedio(){
        return new Diario();
    }

}
