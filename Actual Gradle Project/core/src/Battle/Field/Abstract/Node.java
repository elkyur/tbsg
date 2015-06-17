/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Battle.Field.Abstract;

import Battle.Objects.BattleObject;
import Algorithms.GraphAlgorithms.BNode;
import java.util.ArrayDeque;

/**
 *
 * @author elkyur
 */
public abstract class Node extends BNode {
    
    public abstract BattleObject returnBattleObject();
   
    
}
