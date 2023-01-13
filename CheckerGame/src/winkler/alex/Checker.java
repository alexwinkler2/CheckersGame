package winkler.alex;
import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Checker {
	public Checker() {
		Group root = new Group();
		int countVertical = 0;
		int countHorizontal = 0;
		int count = 0;
		for(int i=0; i<8; i++) {
			count++;
			countVertical+=1;
			countHorizontal+=1;
			for(int j=0; j<8; j++) {
				Circle checker = new Circle();
				checker.setCenterX(countVertical);
				checker.setCenterY(countHorizontal);
				checker.setRadius(20);
				if(count %2 !=0) {
					root.getChildren().addAll(checker);
				}
			}
		}
	}
}