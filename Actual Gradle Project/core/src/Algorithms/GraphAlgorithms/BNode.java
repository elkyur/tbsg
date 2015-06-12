/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.GraphAlgorithms;

import Battle.Field.SquareField.SquareFieldPoint;
import Battle.Objects.Mover;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 * @param <Obj>
 */
public abstract class BNode<Obj> {

    private BNode camefrom;
    private double dist;
    private boolean color;
    private LinkedList<BNode> neighbours;

    public abstract Obj returnObject();

    public abstract double groundCost(Mover d);

    public BNode() {
        this.neighbours = new LinkedList<BNode>();
        camefrom = null;
        dist = -1;
        color = true;
    }

    public LinkedList<BNode> returnNeighbours() {

        return neighbours;

    }

    public void addneighbour(BNode another) {
        this.neighbours.add(another);

    }

    public BNode cameFrom() {
        return this.camefrom;
    }

    public void reset() {
        this.camefrom = null;
        this.dist = Integer.MAX_VALUE;
        this.color = true;
    }

    public void defineCameFrom(BNode fanta) {
        this.camefrom = fanta;
    }

    public double returnDist() {
        return dist;
    }

    public void defineDist(double sprite) {
        this.dist = sprite;
    }

    public void defineColor(boolean cocacola) {
        this.color = cocacola;
    }

    public boolean returnColor() {
        return this.color;
    }

}
