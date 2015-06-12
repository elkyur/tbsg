package graphics.battle;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import logics.units.Unit;

public class BattleField extends JPanel implements Runnable{
	private int x;
	private int y;
	private boolean a;
	private boolean run;
	private boolean update;
	private ArrayList<Unit> yksikot;
	//private ArrayList<Integer> xPUnit;
	//private ArrayList<Integer> yPUnit;  //Tarvitaanko?
	
	public BattleField(int x, int y){
		this.x = x;
		this.y = y;
		this.a = true;
		this.run = true;
		update = false;
	}
	
	public boolean kaynnista(){
		run = true;
		if(a){
			Thread t = new Thread(this);
			Thread t2 = new Thread(this);
			t.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e){
				System.err.println("Starting process has been interrupted! Canceling all progress.");
				sammuta();
				return false;
			}
			t2.start();
			return true;
		}
		return false;
		
	}
	
	public void sammuta(){
		run = false;
	}

	@Override
	public void run(){
		if(a){
			
			a = false;
		}
		while(run){
			if(update){
				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Interrupted Battlefield Graphics!");
			}
		}
		
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		paintField(g);
	}
	
	private void paintField(Graphics g){
		
	}
}
