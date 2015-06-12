/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import Unit.UnitStack;

/**
 *
 * @author alexey
 */
public abstract class UnitReceiver {
    
    boolean receiveArmy(int stack, UnitStack incoming, UnitStack[] stacks){
        if(stacks[stack]==null){
            stacks[stack]=incoming;
        }else
        if(incoming.equals(stacks[stack])){
          stacks[stack].receiveStack(incoming);
          return true;
        }
        return false;
    }
}
