// Made bricks as seperate Class named MapGenerator
package demogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
  //Variables declared that will be used to make brick
	public int map[] [];
	public int brickWidth;
	public int brickHeight;
	//Making constructor with two parameters row and column
	public MapGenerator(int row, int col) {
		map=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				map[i][j]=1;
				
			}
		}
		//Inserting Variables width, height
		brickWidth=540/col;
		brickHeight=150/row;
		
	}
	
	public void setBrick(int value,int r,int c) {
		map[r][c]=value;
	}
	
	public void draw(Graphics2D g) {
		// Drawing  bricks with rectangle as light gray 
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(map[i][j]>0) {
					
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
					
					g.setColor(Color.black);
					g.setStroke(new BasicStroke(3));  //For accurate gap
					
					g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
					
				
				}
				
			}
			
		}
		
		
	}
}
