package com.example.tacocloud.tacos;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Type;

@Data
@RequiredArgsConstructor
public class Ingredients {
    private final String id;
    private final String name;
    private final Type type;

    /*public Ingredients(String id, String name) {
        this.id = id;
        this.name = name;
        type = null;
    }*/
    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }

}
