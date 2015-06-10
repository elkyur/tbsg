/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.GraphAlgorithms;

import Battle.Objects.Mover;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * This class has collections of Dijstra-like algorithms for our Graphs
 */
public class Dijstra {

    Comparator<BNode> comp;
 

    public Dijstra() {
        this.comp = new Comparator<BNode>() {

            @Override
            public int compare(BNode o1, BNode o2) {
                if (o1.returnDist() > o2.returnDist()) {
                    return 1;
                } else if (o1.returnDist() == o2.returnDist()) {
                    return 0;

                } else {
                    return -1;
                }
            }
        };

    }

    /**
     *
     * Finds out which points are inside radius of variable max and returns them
     * as greenpoints,those points that are edge points will be returned as
     * yellowpoints
     *
     * REMEMBER TO NODES CLEAR AFTER OR BEFORE USE!!!
     */
    public void radiusOfDijstra(Mover m, double max, BNode startingNode, int maxNumberofpoints, BGraph graafi, HashSet<BNode> greenpoints, HashSet<BNode> yellowpoints) {

        startingNode.defineDist(0);
        PriorityQueue<BNode> pepsi = new PriorityQueue<BNode>(maxNumberofpoints, this.comp);
        startingNode.defineDist(0);
        pepsi.add(startingNode);
        while (!pepsi.isEmpty()) {
            BNode u = pepsi.poll();
            if (u.returnColor() == false) {
                continue;
            }
            LinkedList<BNode> f = graafi.getNeighbours(u);
            for (BNode v : f) {
                // Estäjä, estää ruudule pääsyn jos sinne ei saisi mennä
             if (!graafi.Allowed(m, v))
             {
              continue;
              }
                
                double alt = u.returnDist() + v.groundCost();
                if ((alt < v.returnDist())) {
                    v.defineDist(alt);
                    v.defineCameFrom(u);
                    if (alt <= max) {
                        greenpoints.add(v);
                        pepsi.add(v);

                    } else {
                        yellowpoints.add(v);
                    }

                }

            }

            u.defineColor(false);
        }
        //Remember to clear BNodes before use;

    }

}
