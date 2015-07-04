/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;
import Map.Hero;
import java.util.ArrayList;
/**
 *
 * @author alexey
 */
public class Player {
    private int colour;
    private ArrayList<Hero> heroes = new ArrayList<Hero>();
    private int[] resources=new int[10]; //0-gold 1-wood...
    
    

    public Player(int colour) {
        this.colour = colour;
    }
     
    public boolean addHero(Hero hero){
       if(heroes.get(7)==null){
           heroes.add(hero);
           return true;
       }
       return false;
    }
    public void removeHero(int place){
        heroes.remove(place);
    }
    
    public void moreResource(int res, int count){
        resources[res]+=count;
    }
}
