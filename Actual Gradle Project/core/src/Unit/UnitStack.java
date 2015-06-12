/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author elkyur
 */
public class UnitStack{

    private ArrayList<Unit> units =new ArrayList<Unit>();
    

    public UnitStack() {

    }

    public ArrayList<Unit> returnUnitsAsArrayList() {
        return units;
    }
    public void testo(){
        for(Unit u:units){
            u.testOut();
        }
    }
    
    public int returnCount(){
    	return units.size();
    }
    
    public UnitType returnUnitType(){
    	if(units.size() > 0){
    		return units.get(0).returnUnitType();
    	}
    	return null;
    }

    public boolean equals(Unit unit){  //Equals only types not count.
        if(this.returnUnitType().equals(unit.returnUnitType())){
            return true;
        }
        return false;
    }
    
    public void addUnit(Unit u){
        this.units.add(u);
    }
    
    public void receiveStack(UnitStack u){
        ArrayList<Unit> l= u.returnUnitsAsArrayList();
        for(Unit un : l){
            this.units.add(un);
        }
    }
    
    public UnitStack sendStack(ArrayList<Integer> places){
        Collections.sort(places);
        UnitStack sent=new UnitStack();
        for (int place:places){
            sent.addUnit(this.units.get(place));
        }
        int i = places.size()-1;
        while(i>=0){
            int r=places.get(i);
            units.remove(r);
            i--;
        }
        return sent;
    }
  
    

}
