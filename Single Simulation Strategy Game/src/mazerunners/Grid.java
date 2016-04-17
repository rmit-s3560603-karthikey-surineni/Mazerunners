package mazerunners;
import java.util.*;

public class Grid {

	private int rows;
	private int columns;
	
	public Grid(){ //Constructor initializing Grid class 
		
		rows=0;
		columns=0;
	}
	
	public void constructGrid(int row,int col){
	
		rows = row;
		columns = col;
		
	}
	public void mazeGrid(){
		
		boolean flag1 = true;
		boolean flag2 = false;
		
		Cell initiate_cell= new Cell();
		
		// 
		for(int c=0;c<columns;c++){
			for(int r=0;r<rows;r++){
		
				initiate_cell.cell(r,c,flag1);
		
			}//closing rows loop
		}//closing columns loop
	}
}
