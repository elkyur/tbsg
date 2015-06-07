/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Field.SquareField;

import Battle.Field.Abstract.Node;
import Battle.Objects.BattleObject;
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

    public SquareFieldPoint(TerrainType terrain) {
        this.terrain = terrain;
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
    public double groundCost() {
        return this.terrain.returnMovementcost();
    }

}
