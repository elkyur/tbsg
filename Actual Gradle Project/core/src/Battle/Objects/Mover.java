/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle.Objects;

import Battle.Field.Abstract.Node;

/**
 *
 * @author elkyur Kaikkien liikkuvien "alkuluokka"
 */
public abstract class Mover {

    private Node location;
    private int entrancecode;

    public Mover() {

    }

    public void setEntrancecode(int ent) {
        this.entrancecode = ent;
    }

    public int returnEntrancecode() {
        return this.entrancecode;
    }

    public void setNode(Node location) {
        this.location = location;

    }

    public Node getNode() {
        return location;
    }

}
