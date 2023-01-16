package winkler.alex;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class GUIDriver extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane board = new GridPane();
        
        int count = 0; 
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
            	int verticalCount = 0;
            	int horizontalCount = 0;
            	verticalCount +=25;
            	horizontalCount+=25;
                Button b = new Button("");
                b.setPrefSize(50, 50);
                if (count % 2 != 0) {
                    b.setStyle("-fx-background-color: green;");
                } else {
                    b.setStyle("-fx-background-color: white;");
                }
                if (b.getStyle().equals("-fx-background-color: green;")) {
                    b.setOnMousePressed(e -> b.setStyle("-fx-background-color: yellow;"));
                } else {
                    b.setOnMousePressed(e -> {});
                }
                b.setOnMouseReleased(e -> {
                    if (b.getStyle().equals("-fx-background-color: white;")) {
                        b.setStyle("-fx-background-color: white;");
                    } else {
                        b.setStyle("-fx-background-color: green;");
                    }
                });
                
            
        
                board.add(b,j, i);
               
                
               
                
                count++;
            }
        }
       count = 0;
        for(int j = 0;j<8;j++) {
        	count++;
          for(int i = 0;i < 8;i++) {
        	  if(i%2 == 0 && j%2 ==0) {
        	  	Checker redChecker = new Checker(Color.RED);
        	  	board.add(redChecker, i, j);
        	  }
          }
          for(int i = 0;i < 8;i++) {
        	  if(i%2 != 0 && j%2 !=0) {
        	  	Checker blackChecker = new Checker(Color.RED);
        	  	board.add(blackChecker, i, j);
        	  }
          }
        
        }
		
        
        Scene scene = new Scene(board);
        stage.setScene(scene);
        stage.show();
    }
}


