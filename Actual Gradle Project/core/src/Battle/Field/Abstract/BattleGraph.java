/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Battle.Field.Abstract;

import Algorithms.GraphAlgorithms.BGraph;
import Battle.Field.Abstract.Node;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public abstract class BattleGraph extends BGraph {
    
   public abstract LinkedList allNodes();
   public abstract boolean Siirtyma(Node alku, Node loppu);
   
    
    
    
}
