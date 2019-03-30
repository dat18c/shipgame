package dk.kea.shipgame.Model;

import java.util.Objects;

public class Order {

    private int shipId;
    private int turn; //sharp left, left, straight, right, sharp right - Enum?
    private int sailUsage; //sail percentage 0 25 50 75 100 (depending on MAX_SPEED
    private boolean fire; //shoot?
    private int ammunitionType; //0=canonball, 1=chainball, 2=grapeshot
    private int target; //not possible to shoot straight forward or backward - Enum?

    public Order() {
    }

    public Order(int shipId, int turn, int sailUsage, boolean fire, int ammunitionType, int target) {
        this.shipId = shipId;
        this.turn = turn;
        this.sailUsage = sailUsage;
        this.fire = fire;
        this.ammunitionType = ammunitionType;
        this.target = target;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getSailUsage() {
        return sailUsage;
    }

    public void setSailUsage(int sailUsage) {
        this.sailUsage = sailUsage;
    }

    public boolean isFire() {
        return fire;
    }

    public int isAmmunitionType() {
        return ammunitionType;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public void setAmmunitionType(int ammunitionType) {
        this.ammunitionType = ammunitionType;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

}
