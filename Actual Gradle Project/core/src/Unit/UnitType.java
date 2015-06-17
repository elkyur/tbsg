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
	
    
    private int maxHp;
    private int maXdamage;
    private int miNdamage;
    private int range;
    private int speed; // Speed 100 means 1 square
    private int attackSkill;
    private int defenseSkill;
    private int freqvenss; // freqvenss 1000 means 1
    private int movementType; //0-Walk 1-Fly 2-Teleport
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
    
    public int returnTier(){
    	return unitTier;
    }

    
    public boolean equals(UnitType u) {
        if(this.unitTier==u.returnTier()&&unitCastle.equals(this.unitCastle)) {
            return true;
        } 
        return false;
    }
}
