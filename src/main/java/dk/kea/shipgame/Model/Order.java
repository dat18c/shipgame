package dk.kea.shipgame.Model;

import java.util.Objects;

public class Order {

    private int shipId;
    private int turn; //sharp left, left, straight, right, sharp right - Enum?
    private int sailUsage; //sail percentage
    private boolean fire; //shoot?
    private int target; //not possible to shoot straight forward or backward - Enum?

    public Order() {
    }

    public Order(int shipId, int turn, int sailUsage, boolean fire, int target) {
        this.shipId = shipId;
        this.turn = turn;
        this.sailUsage = sailUsage;
        this.fire = fire;
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

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

}
