
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
import Unit.UnitStack;
import Unit.Unit;
import Map.Army;
import Map.HeroItems;

public class Hero {
   private String name;
    private int defence;
   private int attack;
    private int speed;
   private int viewRange; //Paska muuutujanimi. Pit'is olla heron nakoetaisyys. Keksikaa parempi.

   private List<Integer> spellbook=new ArrayList<Integer>();
   private List<Integer> skills=new ArrayList<Integer>();
   private Army army=new Army(8);
   private List<Item> items=new ArrayList<Item>();
   private HeroItems wearedItems=new HeroItems();

    public Hero() {
    }
    
    
    
    
    
    public Hero(String name, int defence, int attack, int speed, int viewRange) {
        this.name = name;
        this.defence = defence;
        this.attack = attack;
        this.speed = speed;
        this.viewRange = viewRange;
    }
    
     public void addSpell(int spell){
         spellbook.add(spell);
     }
    
    public void addSkill(int skill){
         skills.add(skill);
     }

    //*********Army methods********
    
    public boolean receiveStack(int stack, UnitStack incoming) {
        return army.receiveStack(stack, incoming);
    }
    
    public UnitStack sendStack(int stack, ArrayList<Integer> places){
        return army.sendStack(stack, places);
    }
    
    
    public UnitStack sendWholeStack(int stack){
        return army.sendWholeStack(stack);
    }
    
    public boolean splitArmy(int from, int to,ArrayList<Integer> places){
       return army.splitStack(from, to, places);
    }
    
    //******Item methods*******
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public boolean wearItem(int from, int where){
        if(wearedItems.canIPut(where, items.get(from))==false){
            return false;
        }
        Item taken=wearedItems.take(where);
        if(taken!=null){
            items.add(taken);
        }
        wearedItems.put(where, items.get(from));
        items.remove(from);
        return true;
    }
    
    public Item takeWeared(int place){
        return wearedItems.take(place);
    }
    
   //*******Stat Increasers*******

    public void moreAttack(int attack) {
        this.attack += attack;
    }

    public void moreDefence(int defence) {
        this.defence += defence;
    }

    public void moreSpeed(int speed) {
        this.speed = +speed;
    }

     //**********GETTERS********
     
     
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
     
    public Army getArmy() {
        return army;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Integer> getSkills() {
        return skills;
    }

    public List<Integer> getSpellbook() {
        return spellbook;
    }

    public int getViewRange() {
        return viewRange;
    }

    public HeroItems getWearedItems() {
        return wearedItems;
    }
    
     
    
}