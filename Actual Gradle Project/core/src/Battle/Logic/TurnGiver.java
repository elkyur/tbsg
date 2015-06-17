/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Battle.Logic;

import Algorithms.GraphAlgorithms.BNode;
import Battle.Field.Abstract.BattleGraph;
import Battle.Objects.Turner;
import Random.randomOwner;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author elkyur O(log n) implementation for turn-giving system (PriorityQueue
 * implementation)
 *
 */
public class TurnGiver {

    private randomOwner randomi;
    private PriorityQueue<Turner> turners;
    private ComporatorForTurnGiver turneriComporaattori;

    public TurnGiver(randomOwner random) {
        this.randomi = random;
        comparatorInit();
        this.turners = new PriorityQueue(100, this.turneriComporaattori);
    }

    // TEST REQUIRED
    public void comparatorInit() {
        this.turneriComporaattori = new ComporatorForTurnGiver(randomi);

    }

    public void addTurnerToMachine(Turner t) {
        this.turners.add(t);
    }

    public Turner iterate() {
        Turner returnable = turners.poll();
        int n = returnable.returnFreq() + returnable.returnTimeGone();
        returnable.setTimeGone(n);
        turners.add(returnable);
        return returnable;
    }
    
    

}
