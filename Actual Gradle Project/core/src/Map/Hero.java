
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *
 * @author alexey
 */

import java.util.List;
import java.util.ArrayList;
import Unit.UnitStack;
import Unit.Unit;

public class Hero extends UnitReceiver{
   private String name;
    private int defence;
   private int attack;
    private int speed;
   private int viewRange; //Paska muuutujanimi. Pit'is olla heron nakoetaisyys. Keksikaa parempi.

   private int[] spellbook = new int[100];
   private UnitStack[] stacks=new UnitStack[8];
   private List<Integer> items=new ArrayList<Integer>();
   private List<Integer> wearedItems=new ArrayList<Integer>();

    public Hero() {
    }
    
    
    
    
    
    public Hero(String name, int defence, int attack, int speed, int viewRange) {
        this.name = name;
        this.defence = defence;
        this.attack = attack;
        this.speed = speed;
        this.viewRange = viewRange;
    }

    
    public boolean receiveArmy(int stack, UnitStack incoming) {
        return super.receiveArmy(stack, incoming, this.stacks); 
    }
    
   public void testHoutput(){
       int i=7;
       while(i>=0){
           if(stacks[i]==null){
               System.out.println("null");
           }else{
               stacks[i].testo();
           }
           System.out.println("*");
           i--;
       }
   }
    
    public void removeArmy(int stack, int armySize){
        
    }
    
    public boolean splitArmy(int from, int to,int armySize){
       
           
        return true;
    }
    
    
    
    

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void moreAttack(int attack) {
        this.attack += attack;
    }

    public void moreDefence(int defence) {
        this.defence += defence;
    }

    public void moreSpeed(int speed) {
        this.speed = +speed;
    }

    
    
    
    
}