package winkler.alex;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIDriver extends Application {
	   
public static void main(String[] args) {

launch(args);



       
    }
   //hello
    @Override
    public void start(Stage stage) throws Exception {
    GridPane board = new GridPane();
   
    //Start Of Squares
    int count = 0;
        for (int i = 0; i < 8; i++) {
        count++;
        for (int j = 0; j < 8; j++) {
        Rectangle r = new Rectangle(50, 50, 50, 50);
        if (count % 2 != 0) {
        r.setFill(Color.FORESTGREEN);
        }
        else {
        r.setFill(Color.CORNSILK);
        }
        board.add(r,j, i);
        count++;
        }
        }
        Scene scene = new Scene(board);
        stage.setScene(scene);
        stage.show();




   
   

}
}