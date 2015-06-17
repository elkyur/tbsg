package logics.map;

import java.awt.Panel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.RandomAccessFile;

public class Map {
	private int xDim;
	private int yDim;
	private PipedInputStream in;
	
	public Map(int xDim, int yDim, PipedInputStream in){
		this.in = in;
		this.xDim = xDim;
		this.yDim = yDim;
	}
	
	public Panel openMap(String mapName, boolean load){
		//graphics.map.Map gm = new graphics.map.Map(xDim, yDim);
		File f = new File("data/maps/"+mapName);
		try {
			RandomAccessFile rac = new RandomAccessFile(f, "r");
		if(load){
			
		}else{
			
		}
		rac.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found!!!!! + \n" + e.getMessage());
		} catch (IOException e) {
			System.err.println("IO Exceptioni!!!!! \n" + e.getMessage());
		}
		return null;
	}
	
	public Byte[] dataLayer(){
		return null;
	}
	
	public String returnMapSize(){
		return xDim+"x"+yDim;
	}
}
