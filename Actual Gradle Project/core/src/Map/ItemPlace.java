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
import Map.Item;

public class ItemPlace {
    private int whatCanBeHere;
    private Item item;
    
    public ItemPlace(int whatCanBeHere) {
        this.whatCanBeHere = whatCanBeHere;
    }
    public Item  take(){
        if(item==null){
            return null;
        }
        return item;
    }
     public boolean  canIPut(Item put){
        if(put.getWear()==whatCanBeHere||item==null){
            return true;
        }
        return false;
    }
     
     
     public void  put(Item put){
            this.item=put;   
    }
}
