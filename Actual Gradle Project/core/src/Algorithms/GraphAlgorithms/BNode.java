/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.GraphAlgorithms;

import java.util.ArrayDeque;

/**
 *
 * @author elkyur
 * @param <Obj>
 */
public abstract class BNode<Obj> {

    private BNode camefrom;
    private double dist;
    private boolean color;

    public abstract Obj returnObject();

    public abstract double groundCost();

    public BNode() {
        camefrom = null;
        dist = -1;
        color = true;
    }

    public BNode cameFrom() {
        return this.camefrom;
    }

    public void reset() {
        this.camefrom = null;
        this.dist = -1;
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
