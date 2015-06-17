/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Logic;

import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.BattleGraph;
import Battle.Objects.Mover;
import Battle.Objects.MoverMem.MoverMemory;
import Battle.Objects.MoverMem.PointMemory;
import Random.randomOwner;
import java.util.LinkedList;

/**
<<<<<<< HEAD
 *
 * @author elkyur Some methods for logic
=======
 * 
 * Some methods for logic
>>>>>>> af29c9259afb207f6b7832d697a6c9442545f3c4
 */
public class MethodsForLogic {

    private randomOwner ownaaja;
    private BattleGraph graafi;

    public MethodsForLogic(randomOwner ownaaja, BattleGraph graafi) {
        this.ownaaja = ownaaja;
        this.graafi = graafi;

    }

    /**
     *
     * To get path, read list backwards :D , for example use Descending iterator
     *
     * @param movaaja
     * @param target
     * @return Team of pokemons
     */
    public LinkedList<BNode> path(Mover movaaja, BNode target) {
        LinkedList<BNode> pokemonTeam = new LinkedList<BNode>();
        MoverMemory pikachu = movaaja.returnMem();
        BNode iterating = target;
        while (iterating != null) {
            pokemonTeam.add(iterating);
            PointMemory pichu = pikachu.returnPointMemory(iterating);
            iterating = pichu.returnCamefrom();
        }

        return pokemonTeam;
    }
<<<<<<< HEAD
=======
    
    
>>>>>>> af29c9259afb207f6b7832d697a6c9442545f3c4

    public BNode tryToGoOnYellowPoint(Mover movaaja, BNode yellow, double speedofMover) {
        MoverMemory pikachu = movaaja.returnMem();
        BNode prev = pikachu.returnPointMemory(yellow).returnCamefrom();
        double distanceToYellow = pikachu.returnPointMemory(yellow).returnDistance();
        double distanceToPrev = pikachu.returnPointMemory(prev).returnDistance();
        if (speedofMover == distanceToYellow) {
            return yellow;
        } else {
            double dif = distanceToYellow - distanceToPrev;
            double prob = (speedofMover - distanceToPrev) / dif;
            double random = ownaaja.returnOwner().nextDouble();
            if (random >= prob) {
                return prev;
            } else {
                return yellow;
            }
        }

       
    }

}
