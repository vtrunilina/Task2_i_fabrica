package com.example.demo8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {
    public ColorPicker colorPicer;

    public TextField Calculate;
    public TextField nameShape;
    Color colorchange=Color.BROWN;
   
    @FXML
    private Canvas canvas;
    public void changeColor(ActionEvent actionEvent) {colorchange = colorPicer.getValue();};


    @FXML
    protected void onHelloButtonClickRec() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        Rectangle rec = new Rectangle(colorchange, 100, 100);
        System.out.println(rec.toString());
        rec.draw(gr);

    }
    @FXML
    protected void onHelloButtonClickPoly() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        Polyg poly = new Polyg() {
            @Override
            public String toString() {
                return null;
            }
        };
        System.out.println(poly.toString());
        poly.draw(gr);

    }


    @FXML
    protected void onHelloButtonClickOval() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        Oval ova = new Oval(colorchange, 100, 100);
        System.out.println(ova.toString());
        ova.draw(gr);
    }

public void onMouseEntered(MouseEvent mouseEvent){
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.createShape(nameShape);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        shape.draw(gc);

   // GraphicsContext gr = canvas.getGraphicsContext2D(); //получить контекст(холст) для рисования

  //  shape.draw(gr); //вызов метода рисования по холсту

    }
}