/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.util.Random;

/**
 *
 * @author elkyur This class has link to the Random and also has some methods
 *
 */
public class randomOwner {

    private Random random;

    randomOwner() {
        long p = System.currentTimeMillis();
        this.random = new Random(p);
    }

    public Random returnOwner() {

        return this.random;

    }

}
