/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.Abstract;

import Algorithms.GraphAlgorithms.BGraph;
import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.Node;
import Battle.Objects.Mover;
import Unit.UnitStack;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public abstract class BattleGraph extends BGraph {

    public abstract boolean Siirtyma(Node alku, Node loppu);

    // Yksinkertainen implementointi: 
    @Override
    public boolean Allowed(Mover liikkuva, BNode node) {
        if (node.returnObject() == null)
        {
        return true;
        }
            
        return false;
    }

}
