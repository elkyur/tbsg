/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.Hexa;

import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.BattleGraph;
import Battle.Field.Abstract.Node;
import Battle.Field.SquareField.SquareFieldPoint;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public class HexaField extends BattleGraph {

    private HexaPoint[][] matrice;
    private LinkedList<BNode> allNodes;

    public HexaField(int x, int y) {
        this.matrice = new HexaPoint[x][y];
        this.allNodes = new LinkedList<BNode>();
        initField();
        initNeighboo();

    }

    private void initField() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = new HexaPoint();
                this.allNodes().add(matrice[i][j]);
            }
        }

    }

    private void initNeighboo() {

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {

                HexaPoint iterating = this.matrice[i][j];

                if ((i == 0) && (j == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i + 1][j + 1]);

                } else if ((i == 0) && (j == matrice[0].length - 1)) {

                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);

                } else if ((i == matrice.length - 1) && (j == 0)) {

                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i - 1][j]);
                    if (i % 2 == 0) {
                        iterating.addneighbour(matrice[i - 1][j + 1]);
                    }

                } else if ((i == matrice.length - 1) && (j == matrice[0].length - 1)) {

                    iterating.addneighbour(matrice[i - 1][j]);
                    iterating.addneighbour(matrice[i][j - 1]);
                    if (i % 2 == 1) {
                        iterating.addneighbour(matrice[i - 1][j - 1]);
                    }

                } else if ((i == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i][j - 1]);

                    iterating.addneighbour(matrice[i + 1][j + 1]);

                } else if ((j == 0)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);
                    if (i % 2 == 0) {
                        iterating.addneighbour(matrice[i + 1][j + 1]);
                        iterating.addneighbour(matrice[i - 1][j + 1]);
                    }

                } else if ((i == matrice.length - 1)) {
                    iterating.addneighbour(matrice[i][j + 1]);
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i - 1][j]);
                    if (i % 2 == 0) {
                        iterating.addneighbour(matrice[i - 1][j + 1]);
                    } else {
                        iterating.addneighbour(matrice[i - 1][j - 1]);

                    }
                } else if ((j == matrice[0].length - 1)) {
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);

                    if (i % 2 == 1) {
                        iterating.addneighbour(matrice[i + 1][j - 1]);
                        iterating.addneighbour(matrice[i - 1][j - 1]);
                    }

                } else {
                    iterating.addneighbour(matrice[i][j - 1]);
                    iterating.addneighbour(matrice[i + 1][j]);
                    iterating.addneighbour(matrice[i - 1][j]);
                    iterating.addneighbour(matrice[i][j + 1]);
                    if (i % 2 == 0) {
                        iterating.addneighbour(matrice[i + 1][j + 1]);
                        iterating.addneighbour(matrice[i - 1][j + 1]);

                    } else {
                        iterating.addneighbour(matrice[i + 1][j - 1]);
                        iterating.addneighbour(matrice[i - 1][j - 1]);
                    }
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
    public LinkedList<BNode> allNodes() {
        return this.allNodes;
    }

    @Override
    public void justforfun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
