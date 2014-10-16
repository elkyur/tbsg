/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.SquareField;

import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.BattleGraph;
import Battle.Field.Abstract.Node;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public class SquareField extends BattleGraph {

    private SquareFieldPoint[][] matrice;

    public SquareField(int x, int y) {
        this.matrice = new SquareFieldPoint[x][y];

    }

    public void initMatrice() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = new SquareFieldPoint(null);
            }

        }

    }

    public void initNeighboo() {

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
             
                
            }

        }

    }

    @Override
    public boolean Siirtyma(Node alku, Node loppu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<BNode> getNeighbours(BNode n) {
        return null;

    }

    @Override
    public LinkedList allNodes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
