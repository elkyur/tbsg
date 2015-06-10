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

    public UnitStack() {

    }

    public ArrayList<Unit> returnUnit() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }
    

}
