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
    final private String name;
    final private int wear; //0-cant wear 1-head 2 hands 3-chest...
    final private boolean bottle;
    final private int id;

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
