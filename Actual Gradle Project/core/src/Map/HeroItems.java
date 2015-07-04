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
import java.util.ArrayList;

import Map.Item;
public class HeroItems {
    private Item[] items =new Item[15];

    public HeroItems() {
        
    }
    
    public boolean canIPut(int place, Item item){
        if(item.getWear()==place){
            return true;
        }
        return false;
    }
    
    public Item take(int place){
        if(items[place]==null){
            return null;
        }
        return items[place];
    }
    
    public void put(int place, Item item){
        items[place]=item;
    }
}
