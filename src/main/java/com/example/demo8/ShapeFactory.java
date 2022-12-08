package com.example.demo8;

import javafx.scene.control.TextField;
import javafx.scene.shape.Polygon;

public class ShapeFactory {
    public Shape createShape(TextField nameShape) {
        if (nameShape.getText().equals("Квадрат"))
        {
            return new Rectangle();
        }
        if (nameShape.getText().equals("Овал"))
        {
            return new Oval();
        }
        else
        {
            return new Polyg() {
                @Override
                public String toString() {
                    return null;
                }
            };
        }

}}
