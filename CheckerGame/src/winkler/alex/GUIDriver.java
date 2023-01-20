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

    Board board = new Board(8,8);
    
    @Override
    public void start(Stage stage) throws Exception {
    	ArrayList <Checker> redCheckerTracker = new ArrayList<Checker>();
    	ArrayList <Checker> blackCheckerTracker = new ArrayList<Checker>();
    	ArrayList<Button> buttonTracker = new ArrayList<Button>();
    	GridPane grid = new GridPane();
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
        			int row = ((NewButton) e.getSource()).getRow();
        			int col = ((NewButton) e.getSource()).getCol();
        			System.out.println(board.getState(row,col));
        		});
               
             
               
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
                
                grid.add(b,j, i);
               count++;
            }
        }
                
            
        
                
        
       count = 0;
        for(int j = 0;j<8;j++) {
        	count++;
          for(int i = 0;i < 8;i++) {
        	  if(i%2 == 0 && j%2 ==0 && i < 4) {
        	  	Checker redChecker = new Checker(CellState.P1,i,j);
        	  	
        	 // Add to grid for location tracking
        	  	board.setChecker(redChecker);
        	  	
        	  	// Add to grid pane
        	  	grid.add(redChecker, j, i);
        	  	
        	  	// Add to Arraylist for tracking purposes
        	  	redCheckerTracker.add(redChecker);
        	  	
        	  	
        	  	
        	  	
        	  }
          }
          for(int i = 0;i < 8;i++) {
        	  if(i%2 != 0 && j%2 !=0 && i==1) {
        	  	Checker redChecker = new Checker(CellState.P1,i,j);
        	  	grid.add(redChecker, j, i);
        	  	redCheckerTracker.add(redChecker);
        	  	board.setChecker(redChecker);
        	  }
          }
        }
        for(int j = 0;j<8;j++) {
        	
            for(int i = 0;i < 8;i++) {
          	  if(i%2 == 0 && j%2 ==0 && i > 4) {
          	  	Checker blackChecker = new Checker(CellState.P2,i,j);
          	  	grid.add(blackChecker, j, i);
          	  	blackCheckerTracker.add(blackChecker);
          	  board.setChecker(blackChecker);
          	  }
            }
            for(int i = 0;i < 8;i++) {
          	  if(i%2 != 0 && j%2 !=0 && i>4 ) {
          	  	Checker blackChecker = new Checker(CellState.P2,i,j);
          	  	grid.add(blackChecker, j, i);
          	  	blackCheckerTracker.add(blackChecker);
          	  board.setChecker(blackChecker);
          	  }
            }
          }
        
        
       
       
        
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.show();
        
        
    }
}



