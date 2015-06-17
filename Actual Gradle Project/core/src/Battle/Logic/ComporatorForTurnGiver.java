/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Logic;

import Battle.Objects.Turner;
import Random.randomOwner;
import java.util.Comparator;

/**
 *
 * @author elkyur
 */
public class ComporatorForTurnGiver implements Comparator<Turner> {

    private randomOwner randomi;

    public ComporatorForTurnGiver(randomOwner randomi) {
        this.randomi = randomi;
    }

    @Override
    public int compare(Turner o1, Turner o2) {
        if (o1.returnTimeGone() - o2.returnTimeGone() > 0) {
            return 1;
        } else if (o1.returnTimeGone() == o2.returnTimeGone()) {
            int d = randomi.returnOwner().nextInt(2);
            if (d == 0) {
                return -1;
            }
            return 1;
        } else {

            return -1;
        }

    }

}
