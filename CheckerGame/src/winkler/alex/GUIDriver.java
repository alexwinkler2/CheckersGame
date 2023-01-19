package winkler.alex;



import java.util.ArrayList;

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

    Board grid = new Board(8,8);
    
    @Override
    public void start(Stage stage) throws Exception {
    	ArrayList <Checker> redCheckerTracker = new ArrayList<Checker>();
    	ArrayList <Checker> blackCheckerTracker = new ArrayList<Checker>();
    	ArrayList<Button> buttonTracker = new ArrayList<Button>();
    	GridPane board = new GridPane();
        int count = 0;
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
                NewButton b = new NewButton(i,j);
                b.setPrefSize(50, 50);
                buttonTracker.add(b);
                if (count % 2 != 0) {
                    b.setStyle("-fx-background-color: green;");
                } else {
                    b.setStyle("-fx-background-color: white;");
               
                }
                
                
        		b.setOnAction( e -> {
        			System.out.println(e.getSource().toString());
        			
        		});
               grid.getState(7, 7);
             
               
                /**if (b.getStyle().equals("-fx-background-color: green;")) {
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
                });*/
                
                board.add(b,j, i);
               count++;
            }
        }
                
            
        
                
        
       count = 0;
        for(int j = 0;j<8;j++) {
        	count++;
          for(int i = 0;i < 8;i++) {
        	  if(i%2 == 0 && j%2 ==0 && j < 4) {
        	  	Checker redChecker = new Checker(CellState.P1,j,i);
        	  	
        	  	// Add to grid pane
        	  	board.add(redChecker, i, j);
        	  	
        	  	// Add to Arraylist for tracking purposes
        	  	redCheckerTracker.add(redChecker);
        	  	
        	  	// Add to grid for location tracking
        	  	grid.setChecker(redChecker);
        	  	
        	  	
        	  }
          }
          for(int i = 0;i < 8;i++) {
        	  if(i%2 != 0 && j%2 !=0 && i==1) {
        	  	Checker redChecker = new Checker(CellState.P1,j,i);
        	  	board.add(redChecker, j, i);
        	  	redCheckerTracker.add(redChecker);
        	  	grid.setChecker(redChecker);
        	  }
          }
        }
        for(int j = 0;j<8;j++) {
        	
            for(int i = 0;i < 8;i++) {
          	  if(i%2 == 0 && j%2 ==0 && j > 4) {
          	  	Checker blackChecker = new Checker(CellState.P2,j,i);
          	  	board.add(blackChecker, i, j);
          	  	blackCheckerTracker.add(blackChecker);
          	  grid.setChecker(blackChecker);
          	  }
            }
            for(int i = 0;i < 8;i++) {
          	  if(i%2 != 0 && j%2 !=0 && i>4 ) {
          	  	Checker blackChecker = new Checker(CellState.P2,j,i);
          	  	board.add(blackChecker, j, i);
          	  	blackCheckerTracker.add(blackChecker);
          	  grid.setChecker(blackChecker);
          	  }
            }
          }
        
        
       
       
        
        Scene scene = new Scene(board);
        stage.setScene(scene);
        stage.show();
        
        
    }
}



