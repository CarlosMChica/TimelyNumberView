package com.carlosdelachica.timelynumberview.model.number;


import com.carlosdelachica.timelynumberview.model.core.Figure;

public class Null extends Figure {
    private static final float[][] POINTS = {
            {0.5f, 0.5f},   {0.5f, 0.5f},   {0.5f, 0.5f},
            {0.5f, 0.5f},   {0.5f, 0.5f},   {0.5f, 0.5f},
            {0.5f, 0.5f},                   {0.5f, 0.5f},                   {0.5f, 0.5f},
            {0.5f, 0.5f},                   {0.5f, 0.5f},                   {0.5f, 0.5f},
            {0.5f, 0.5f}
    };

    private static final Null INSTANCE = new Null();

    protected Null() {
        super(POINTS);
    }

    public static Null getInstance() {
        return INSTANCE;
    }
}