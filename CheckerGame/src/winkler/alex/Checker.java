package winkler.alex;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Checker extends Circle {
	
	private int row;
	private int col;
	private CellState player;
    public Checker(CellState player, int row, int col) {
    	
    	super();
        this.setRadius(10);
        this.row = row;
        this.col = col;
        this.player = player;
        
        if(this.player == CellState.P1) {
        	this.setFill(Color.RED);
        }
        else {
        	this.setFill(Color.BLACK);
        }
    }
    public CellState getState(Checker c) {
    	System.out.println(player);
    	return player;
    }
    public int getRow(Checker c) {
    	return c.row;
    }
    public int getCol(Checker c) {
    	return c.col;
    }
}