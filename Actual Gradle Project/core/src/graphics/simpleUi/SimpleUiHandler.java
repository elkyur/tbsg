package graphics.simpleUi;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;



public class SimpleUiHandler implements Runnable {
	private Boolean powerOn;
	private ArrayList<PipedInputStream> inStream;
	
	public SimpleUiHandler(){
		powerOn = true;
	}
	
	public void addConnection(PipedOutputStream pOS) throws IOException{
		PipedInputStream pIS = new PipedInputStream(pOS);
		inStream.add(pIS);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			//Ignore
		}
		System.err.println("Not implemented yet!");
		
	}
	
	
	}
