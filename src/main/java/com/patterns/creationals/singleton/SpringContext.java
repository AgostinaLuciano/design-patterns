package com.patterns.creationals.singleton;

import java.util.HashMap;
import java.util.Map;

public class SpringContext {

    private static SpringContext instance = null;

    private SpringContext(){
    }

    public static SpringContext getInstance(){
        if (instance == null){
           instance = new SpringContext();
        }
        return instance;
    }


}

