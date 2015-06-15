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
public abstract class Item {
    final String name;
    final int wear; //0-cant wear 1-head 2 hands 3-chest...
    final boolean bottle;
    final int id;

    public Item(String name, int wear ,boolean bottle, int id) {
        this.name = name;
        this.wear = wear;
        this.bottle=bottle;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getWear() {
        return wear;
    }
    public boolean getBottle(){
        return this.bottle;
    }

    public int getId() {
        return id;
    }
    
}
