/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.SquareField;

import Battle.Field.Abstract.Node;
import Battle.Objects.BattleObject;
import Battle.Objects.Mover;
import Battle.Terrain.TerrainType;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author elkyur
 */
public class SquareFieldPoint<Obj> extends Node {

    private TerrainType terrain;
    private BattleObject objectonthespot;
    private String name;

    public SquareFieldPoint(TerrainType terrain) {
        this.terrain = terrain;
    }

    //FOR TESTING
    
    public void setName(String muumilimu) {
        this.name = muumilimu;
    }
    
    //FOR TESTING

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
