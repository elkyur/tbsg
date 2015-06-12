/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Objects;

import Battle.Field.Abstract.Node;
import java.util.LinkedList;
import longheroesproject.BuffOnBattleStack;
import Unit.UnitStack;

/**
 *
 * @author elkyur
 */
public class BattleStack extends Mover {

    private LinkedList<UnitStack> stacks;
    

    public BattleStack() {

    }

  

    public LinkedList<UnitStack> returnStacks() {
        return stacks;
    }

    public void setStacks(LinkedList<UnitStack> stacks) {
        this.stacks = stacks;
    }

   

    @Override
    public Class getObjclass() {
        return BattleStack.class;
    }

}
