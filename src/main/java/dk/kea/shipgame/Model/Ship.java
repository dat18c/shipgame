package dk.kea.shipgame.Model;

import java.util.Objects;

public class Ship {

    private int shipId;
    private String name;
    private int x;
    private int y;
    private int direction; //burde være en ENUM
    private int hull_health; //0 - 100
    private int sail_health; //0 - 100
    private int sailors; //0 - MAX_SAILORS

    public Ship() {
    }

    public Ship(int shipId, String name, int x, int y, int direction, int hull_health, int sail_health, int sailors) {
        this.shipId = shipId;
        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.hull_health = hull_health;
        this.sail_health = sail_health;
        this.sailors = sailors;
    }

    public int getShipId() {
        return shipId;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public int getHull_health() {
        return hull_health;
    }

    public int getSail_health() {
        return sail_health;
    }

    public int getSailors() {
        return sailors;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setHull_health(int hull_health) {
        this.hull_health = hull_health;
    }

    public void setSail_health(int sail_health) {
        this.sail_health = sail_health;
    }

    public void setSailors(int sailors) {
        this.sailors = sailors;
    }

}
