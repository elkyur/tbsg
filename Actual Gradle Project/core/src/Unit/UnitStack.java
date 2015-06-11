/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import java.util.ArrayList;

/**
 *
 * @author elkyur
 */
public class UnitStack {

    private ArrayList<Unit> units;
    private int count;

    public UnitStack() {

    }

    public ArrayList<Unit> returnUnit() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }
    
    public int returnCount(){
    	return count;
    }
    
    public void setCount(int count){
    	this.count = count;
    }
    
    public UnitType returnUnitType(){
    	if(units.size() > 0){
    		return units.get(0).returnUnitType();
    	}
    	return null;
    }
    

}
