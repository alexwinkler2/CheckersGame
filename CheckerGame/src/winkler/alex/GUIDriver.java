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
    
	 @Override
	    public void start(Stage stage) throws Exception {
	  
	    //Start Of Squares
		 GridPane board = new GridPane();
	    	
	    	//Start Of Squares
	    	int count = 0; 
	        for (int i = 0; i < 8; i++) {
	        	count++;
	        	for (int j = 0; j < 8; j++) {
	        		Button b = new Button("");
	        		b.setPrefSize(50, 50);
	        		if (count % 2 != 0) {
	        			b.setStyle("-fx-background-color: green;");

	        			
	        		}
	        		else {
	        			b.setStyle("-fx-background-colour: sand");
	        			
	        		}
	        		board.add(b,j, i);
	        		count++;
	        	}
	        }
	        Scene scene = new Scene(board);

	        
	        stage.setScene(scene);
	        stage.setResizable(false);
	        stage.show();




	   
	   

	}
	}