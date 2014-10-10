/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

import java.util.LinkedList;
import longheroesproject.BuffOnBattleStack;
import longheroesproject.FieldObject;
import Unit.UnitStack;

/**
 *
 * @author elkyur
 */
public class BattleStack implements FieldObject {

    private int[] cordinates;
    private UnitStack stack;
    private LinkedList<BuffOnBattleStack> buffsaffected;
    private int temporalATKBonus;
    private int temporalDEFBonus;
    private int temporalSPDBonus;
    private int hp;

    @Override
    public int[] returnCordinates() {
        return cordinates;
    }

    @Override
    public Object objectType() {
        return this.getClass();
    }

    public int atk() {
        return this.temporalATKBonus;

    }

    public int def() {

        return this.temporalDEFBonus;
    }
    
    public int spd()
    {
    
    return this.temporalSPDBonus;
    }
    public UnitStack returnStack()
    {
    return this.stack;
    }
    public int hp()
    {
    return this.hp;
    
    
    }

}
