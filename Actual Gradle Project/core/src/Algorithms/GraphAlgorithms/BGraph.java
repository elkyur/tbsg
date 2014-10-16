/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.GraphAlgorithms;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public abstract class BGraph {

    public abstract LinkedList<BNode> getNeighbours(BNode n);

    public void clear(LinkedList<BNode> nodet) {
        for (BNode node : nodet) {
            node.reset();
        }

    }
}
