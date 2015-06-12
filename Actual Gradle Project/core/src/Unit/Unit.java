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


public class Unit {
    
    private UnitType ut;
    private int currHP;
    private String testingName;
    //Effect one list OR multiple list own for all example Spells effect, ect.
    
    
    public Unit(String s)
    {
    	this.testingName=s;
    }
    
    public void testOut(){
        System.out.println(testingName);
    }
    
    public void setAttributes(int[] atr)
    {
    int l = atr.length;
    }
    
   public UnitType returnUnitType(){
	   return ut;
   }

    
    public boolean equals(Unit u) {
        if(this.ut.equals(u.returnUnitType())){
            return true;
        }
        return false;
    }

   
    
    
}
