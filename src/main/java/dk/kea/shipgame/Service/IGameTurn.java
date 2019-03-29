package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Order;
import dk.kea.shipgame.Model.Ship;

import java.util.List;

public interface IGameTurn {
    public void move(List<Ship> ships, List<Order> orders); //takes ship and their orders and move them
    public void fire(List<Ship> ships, List<Order> orders); //takes ship and their orders and resolve shooting them
    public void resolveCasualties(List<Ship> ships); //find out if ships are still afloat

}
