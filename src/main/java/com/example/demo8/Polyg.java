package com.example.demo8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Polyg extends Shape {
    @Override
    double area() {
        return 0;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(Color.GRAY);
        gr.setLineWidth(10);
        gr.strokePolygon(new double[]{25, 250},
                new double[]{25,25},2
        );
        gr.strokePolygon(new double[]{30, 30},
                new double[]{25,250},2
        );
    }
}


