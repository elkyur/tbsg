package logics.map;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class MapGraphObject {
	private int x;
	private int y;
	private BufferedImage i;
	
	public MapGraphObject(int x, int y, String nimi){
		this.x = x;
		this.y = y;
		try {
			i = ImageIO.read(new File("src/images/"+nimi));
		} catch (IOException e) {
			System.err.println("Cannot read image! " + nimi + "\n" + e.getMessage());
		}
	}
	
	public int returnX(){
		return x;
	}
	public int returnY(){
		return y;
	}
	public Image returnKuva(){
		return i;
	}
	
}
