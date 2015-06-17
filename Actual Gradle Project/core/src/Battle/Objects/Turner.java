/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Battle.Objects;

import Map.Player.Player;

/**
 *
 * @author elkyur
 */
public interface Turner {
 
    public int returnFreq();
    public void setTimeGone(int remaining);
    public int returnTimeGone();
    public Player returnPlayer();
    
}
