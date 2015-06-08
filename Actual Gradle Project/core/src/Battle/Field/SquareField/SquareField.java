/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.SquareField;

import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.BattleGraph;
import Battle.Field.Abstract.Node;
import Battle.Terrain.TerrainType;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur DO NOT USE THIS FOR 1xn, nx1 CASES
 */
public class SquareField extends BattleGraph {

    private SquareFieldPoint[][] matrice;
    private int xlength;
    private int ylength;
    private LinkedList<BNode> nodes;

    public SquareField(int x, int y) {
        this.matrice = new SquareFieldPoint[x][y];
        xlength = x;
        ylength = y;
        this.nodes = new LinkedList<BNode>();
    }

    public SquareFieldPoint[][] getMatrice() {
        return this.matrice;
    }

    public void initMatrice() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = new SquareFieldPoint(null);
                this.nodes.add(matrice[i][j]);
                // For tests:
                String k = i + "," + j;
                matrice[i][j].setName(k);
            }

        }

    }

    public void setSameTerrainForAll(TerrainType type) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j].redefineTerrain(type);
            }

        }

    }

    public void initNeighboo() {

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {

                SquareFieldPoint iterating = this.matrice[i][j];

                if ((i == 0) && (j == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);

                } else if ((i == 0) && (j == matrice[0].length - 1)) {

                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);

                } else if ((i == matrice.length - 1) && (j == 0)) {

                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i - 1][j]);

                } else if ((i == matrice.length - 1) && (j == matrice[0].length - 1)) {

                    iterating.addneighbour(matrice[i - 1][j]);
                    iterating.addneighbour(matrice[i][j - 1]);

                } else if ((i == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i][j - 1]);

                } else if ((j == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);

                } else if ((i == matrice.length - 1)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i - 1][j]);

                } else if ((j == matrice[0].length - 1)) {
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);

                } else {
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);
                    iterating.addneighbour(matrice[i][j + 1]);

                }

            }

        }

    }

    @Override
    public boolean Siirtyma(Node alku, Node loppu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<BNode> getNeighbours(BNode n) {

        return n.returnNeighbours();

    }

    @Override
    public LinkedList allNodes() {
        return this.nodes;
    }

    @Override
    public void justforfun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
