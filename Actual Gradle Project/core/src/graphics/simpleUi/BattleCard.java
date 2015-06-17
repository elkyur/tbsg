package graphics.simpleUi;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import graphics.components.ImagePanel;

public class BattleCard {
	//Readonly fields
	private final String name;
	private final String castleNtype; //Format example: Rampart: Tier 5
	//ModifiableDields
	private int atk;
	private int def;
	private int maxHP;
	private int dmgMax;
	private int dmgMin;
	private int freqvens; // Freqvens 1000 means 1
	private int speed; // Speed 100 means 1 square
	
	
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
	
	public void setFreq(int freqvens){
		this.freqvens = freqvens;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public ImagePanel returnCard(int xdim, int ydim) throws IOException{ //Exception shouldn't ever happen, unless someone destroys default
		ImagePanel p;
		try {
			p = new ImagePanel("graphics/Units/CardBases/" + this.castleNtype.split(":")[0] + ".gif");
		} catch (IOException e) {
			p = new ImagePanel("graphics/Units/CardBases/TestBase.gif");
		}
		p.setSize(xdim, ydim);
		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		p.add(createTextField(this.name, (int)(2.25*(ydim-xdim*0.75)/(6+1.5+2.25))));
		File f = new File("graphics/Units/UnitPicture/" + this.name + ".gif");
		Image dimg;
		BufferedImage img;
		if(f.exists()){
			img = ImageIO.read(f);
			dimg = img.getScaledInstance((int)(xdim*0.75), (int)(xdim*0.9), Image.SCALE_SMOOTH);
			p.add(new JLabel(new ImageIcon(dimg)));
		}else{
			f = new File("graphics/Units/UnitPictures/testPic.gif");
			img = ImageIO.read(f);
		}
		dimg = img.getScaledInstance((int)(xdim*0.9), (int)(xdim*0.75), Image.SCALE_SMOOTH);
		JLabel temp = new JLabel(new ImageIcon(dimg));
		temp.setVerticalAlignment(JLabel.CENTER);
		p.add(temp);
		p.add(createTextField(this.castleNtype, (int)(1.5*(ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("atk: " + this.atk,(int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("def: " + this.def,(int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("hp: " + this.maxHP,(int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("dmg: " + this.dmgMin + "-" + this.dmgMax,(int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("freq: " + this.freqvens/1000 + "." + (int)((this.freqvens/1000.0-this.freqvens/1000)*10), (int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		p.add(createTextField("speed: " + this.speed/100,(int)((ydim-xdim*0.75)/(6+1.5+2.25))));
		return p;
	}
	
	private JLabel createTextField(String input, int size){
		JLabel temp = new JLabel(input);
		temp.setFont(new Font("Times New Roman", Font.PLAIN, (int)(size*0.75)));
		return temp;
	}

}
