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
import Map.ItemPlace;
import Map.Item;
public class HeroItems {
    private ArrayList<ItemPlace> items =new ArrayList<ItemPlace>();

    public HeroItems() {
        items.add(new ItemPlace(0)); //Generator over here;
    }
    
    public boolean canIPut(int place, Item item){
        return items.get(place).canIPut(item);
    }
    
    public Item take(int place){
        return items.get(place).take();
    }
    
    public void put(int place, Item item){
        items.get(place).put(item);
    }
}
