/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.Hexa;

import Battle.Field.Abstract.Node;
import Battle.Objects.BattleObject;
import Battle.Objects.Mover;
import Battle.Terrain.TerrainType;

/**
 *
 * @author elkyur
 */
public class HexaPoint extends Node {

    private TerrainType terrain;
    private BattleObject objectonthespot;
    private String name;

    public HexaPoint() {

    }

    public String returnName() {
        return name;
    }

    public void redefineTerrain(TerrainType terrain) {

        this.terrain = terrain;
    }

    public TerrainType returnTerrain() {

        return terrain;
    }

    @Override
    public BattleObject returnBattleObject() {
        return this.objectonthespot;
    }

    @Override
    public Object returnObject() {
        return returnBattleObject();
    }

    @Override
    public double groundCost(Mover d) {
        return this.terrain.returnMovementcost(d);
    }

}
