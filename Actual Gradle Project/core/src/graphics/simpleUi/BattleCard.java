package graphics.simpleUi;

import java.io.IOException;

import graphics.components.ImagePanel;

public class BattleCard {
	//Readonly fields
	private final String name;
	private final String castleNtype; //Format example: Rampart: Tier 5, Armored, Piercing
	//ModifiableDields
	private int atk;
	private int def;
	private int maxHP;
	private int dmgMax;
	private int dmgMin;
	private int freq;
	private int speed;
	
	
	public BattleCard(String name, String castleNtype){
		this.name = name;
		this.castleNtype = castleNtype;
	}
	
	public void setAtk(int atk){
		this.atk = atk;
	}
	
	public void setDef(int def){
		this.def = def;
	}
	
	public void setMaxHP(int maxHP){
		this.maxHP = maxHP;
	}
	
	public void setDmgMax(int dmgMax){
		this.dmgMax = dmgMax;
	}
	
	public void setDmgMin(int dmgMin){
		this.dmgMin = dmgMin;
	}
	
	public void setFreq(int freq){
		this.freq = freq;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public ImagePanel returnCard() throws IOException{ //Exception shouldn't ever happen, unless someone destroys default
		ImagePanel p;
		try {
		System.out.println("graphics/Units/CardBases/" + this.castleNtype.split(":")[0]); // Debug
			p = new ImagePanel("graphics/Units/CardBases/" + this.castleNtype.split(":")[0]);
		} catch (IOException e) {
			p = new ImagePanel("graphics/Units/CardBases/TestBase.gif");
		}
		// TODO: Add Layout Manager and text and image fields.
		// TODO: Implement MouseListener -> needed tooltips HUOM: Squares will take care of click Actions
		return p;
	}

}
