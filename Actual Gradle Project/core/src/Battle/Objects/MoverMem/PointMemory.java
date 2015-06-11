/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Objects.MoverMem;

import Algorithms.GraphAlgorithms.BNode;

/**
 *
 * @author elkyur
 */
public class PointMemory {

    private double distance;
    private BNode camefrom;

    public PointMemory(double distance, BNode camefrom) {
        this.distance = distance;
        this.camefrom = camefrom;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public BNode returnCamefrom() {
        return camefrom;
    }

    public double returnDistance() {
        return this.distance;
    }

    public void setCamefrom(BNode camefrom) {
        this.camefrom = camefrom;
    }

}
