package winkler.alex;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Checker extends Circle {
    public Checker(Color color) {
        this.setRadius(10);
        this.setFill(color);
    }
}