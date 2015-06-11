/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Objects.MoverMem;

import Algorithms.GraphAlgorithms.BNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author elkyur
 */
public class MoverMemory {

    HashSet<BNode> greenpoints;
    HashSet<BNode> yellowpoints;
    HashMap<BNode, PointMemory> mapToPointmemory;

    public MoverMemory() {
        this.mapToPointmemory = new HashMap<BNode, PointMemory>();
        this.greenpoints = new HashSet<BNode>();
        this.yellowpoints = new HashSet<BNode>();

    }

    public HashSet<BNode> returnGreen() {
        return greenpoints;

    }

    public HashSet<BNode> returnYellow() {
        return yellowpoints;
    }

    public void setGreenpoints(HashSet<BNode> greenpoints) {
        this.greenpoints = greenpoints;
    }

    public void setYellowpoints(HashSet<BNode> yellowpoints) {
        this.yellowpoints = yellowpoints;
    }

    public void resetMemory() {
        greenpoints.clear();
        yellowpoints.clear();
    }

    public void updateInformation() {
        colaFactory(this.greenpoints);
        colaFactory(this.yellowpoints);

    }

    private void colaFactory(HashSet<BNode> nodet) {
        Iterator iter = nodet.iterator();
        while (iter.hasNext()) {

            BNode node = (BNode) iter.next();
            makeSomeCola(node);
        }
    }

    private void makeSomeCola(BNode node) {
        if (this.mapToPointmemory.containsKey(node)) {
            PointMemory mem = this.mapToPointmemory.get(node);
            mem.setDistance(node.returnDist());
            mem.setCamefrom(node.cameFrom());
        } else {
            this.mapToPointmemory.put(node, new PointMemory(node.returnDist(), node.cameFrom()));
        }

    }

}
