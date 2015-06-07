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
    HashSet<BNode> greenpoints = new HashSet<BNode>();
    HashSet<BNode> yellowpoints = new HashSet<BNode>();
    TerrainType simple = new TerrainType(1);
    SquareField fieldi = new SquareField(10,10);
    fieldi.initMatrice();
    fieldi.setSameTerrainForAll(simple);
    fieldi.initNeighboo();
    Dijstra dijstra = new Dijstra();
    BNode start = fieldi.getMatrice()[0][0];
    System.out.println(fieldi.allNodes().toArray().toString());
    
  //  fieldi.clearUsingOwnList();
    
    dijstra.radiusOfDijstra(3, start, 100 , fieldi, greenpoints, yellowpoints);
    
    System.out.println("päästiin perille");
    System.out.println(yellowpoints.toString());
    
    
    }
}
