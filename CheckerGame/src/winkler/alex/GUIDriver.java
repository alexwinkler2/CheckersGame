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

public class GUIDriver extends Application {
	   
public static void main(String[] args) {

launch(args);



       
    }
   //hello
    @Override
    public void start(Stage stage) throws Exception {
    FileInputStream inputstream = new FileInputStream("checker_board.PNG");
    Image image = new Image(inputstream);
    ImageView imageView = new ImageView(image);
    Group root = new Group ();
    root.getChildren().addAll(imageView);
    GridPane checkers= new GridPane();
    //Start Of Squares
    int count = 0;
        for (int i = 0; i < 8; i++) {
        count++;
        for (int j = 0; j < 8; j++) {
        Circle c = new Circle();
        c.setCenterX(200.0f);
        c.setCenterY(100.0f);
        c.setRadius(50.0f);
        c.setFill(Color.BLACK);
        if (count % 2 != 0) {
        
        }
        else {
        
        }
        if(i > 0 && i <3) {
        	
        }
        count++;
        }
        }
        Scene scene = new Scene(root,400,400);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();




   
   

}
}