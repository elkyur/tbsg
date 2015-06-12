/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Terrain;

import Battle.Objects.Mover;

/**
 *
 * @author elkyur
 */
public class TerrainType {

    private double movementcosts;

    public TerrainType(double move) {

        this.movementcosts = move;
    }

    public double returnMovementcost(Mover d) {

        return movementcosts;
    }

}
