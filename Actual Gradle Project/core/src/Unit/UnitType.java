/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unit;

/**
 *
 * @author elkyur
 */
public class UnitType {
	
	private int maxhp;
    private int maxdamage;
    private int mindamage;
    private int range;
    private int movementgrids;
    private int atkskill;
    private int defenseskill;
    private int freq;
    private String unitName;
    private String unitCastle;
    private int unitTier; // example tier 1 is 10, and upgrades goes 11,12 ect.
    
    public UnitType(){
    	// TODO: Construcktor gets all attributes
    }
    
    public String returnUnitName(){
    	return unitName;
    }
    
    public String returnUnitCastle(){
    	return unitCastle;
    }
    
    private int returnTier(){
    	return unitTier;
    }
}
