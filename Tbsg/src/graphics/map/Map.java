package graphics.map;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import logics.map.MapGraphObject;


public class Map extends JPanel{
	private final int MAXOBJECTSIZE = 500;
	
	private ArrayList<MapGraphObject> ob;
	private int x0;
	private int y0;
	private int x1;
	private int y1;
	
	public Map(){
		this.ob  = new ArrayList<MapGraphObject>();
	}
	
	public void setXYArea(int x0, int y0, int x1, int y1){
		this.x0 = x0; this.x1 = x1; this.y0 = y0; this.y1 = y1;
	}
	
	public void addObject(MapGraphObject ob){
		this.ob.add(ob);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doStuff(g);
	}
	
	private void doStuff(Graphics g){
		for (MapGraphObject o : ob){
			if(x0-MAXOBJECTSIZE <= o.returnX() && y0-MAXOBJECTSIZE <= o.returnY() && o.returnX() <= x1 && o.returnY() <= y1){
				g.drawImage(o.returnKuva(), o.returnX(), o.returnY(), null);
			}
		}
	}

}
