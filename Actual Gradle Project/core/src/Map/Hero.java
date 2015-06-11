
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
import  java.util.ArrayList;

public class Hero {
    String name;
    int defence;
    int attack;
    int speed;
    int viewRange; //Paska muuutujanimi. Pit'is olla heron nakoetaisyys. Keksikaa parempi.
    int[] stackId = new int[]{0,0,0,0,0,0,0,0};
    int[] stackSize = new int[]{0,0,0,0,0,0,0,0};
    int[] spellbook = new int[100];
    List<Integer> items=new ArrayList<Integer>();
    List<Integer> wearedItems=new ArrayList<Integer>();
    
    
    
    
    public Hero(String name, int defence, int attack, int speed, int viewRange) {
        this.name = name;
        this.defence = defence;
        this.attack = attack;
        this.speed = speed;
        this.viewRange = viewRange;
    }
    
    boolean putArmy(int armyID,int armySize,int stack){
        if(stackId[stack]==armyID||stackId[stack]==0){
           stackId[stack]=armyID;
           stackSize[stack]+=armySize;
           return true;
        } 
        System.out.println("There are different units in this stack.");
        return false;
    }
    
    void removeArmy(int stack, int armySize){
        if(stackSize[stack]>armySize){
            armySize=0;
        }else{
            stackSize[stack] -= armySize;
        }
    }
    
    boolean splitArmy(int from, int to,int armySize){
        if(stackId[from]!=stackId[to]||stackSize[from]>armySize){
            System.out.println("Different types or too many.");
            return false;
        }
           this.putArmy(stackId[from], armySize, to);
           this.removeArmy(from, armySize);
           
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