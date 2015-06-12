/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_packed.Algorithmtest;

import Algorithms.GraphAlgorithms.BNode;
import Algorithms.GraphAlgorithms.Dijstra;
import Battle.Field.Abstract.BattleGraph;
import Battle.Field.SquareField.SquareField;
import Battle.Objects.BattleStack;
import Battle.Objects.Mover;
import Battle.Terrain.TerrainType;
import java.util.HashSet;

/**
 *
 * @author elkyur
 */
public class DijstraTest {

    public static void main(String[] args) {
        System.out.println("Testataan tätä vähän");
        YksinkertainenTestaus();

    }
    public static void YksinkertainenTestaus()
    {
    BattleStack stacki = new BattleStack();

    TerrainType simple = new TerrainType(1);
    SquareField fieldi = new SquareField(6,6);
    fieldi.initMatrice();
    fieldi.setSameTerrainForAll(simple);
    fieldi.initNeighboo();
    Dijstra dijstra = new Dijstra();
    BNode start = fieldi.getMatrice()[0][0];
    
    
    dijstra.radiusOfDijstra(stacki, 3, start, 100 , fieldi);
    
        HashSet<BNode> greenpoints = stacki.returnMem().returnGreen();
    HashSet<BNode> yellowpoints = stacki.returnMem().returnYellow();
    
    System.out.println("Keltaiset:");
    System.out.println(yellowpoints.toString());
    System.out.println("Vihreät:");
    System.out.println(greenpoints.toString());
    
    
    
    
    }
}
