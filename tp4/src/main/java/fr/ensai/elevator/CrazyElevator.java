package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Represents an elevator in a hotel simulation.
 * <p>
 * Each Elevator has an ID, capacity, current floor, a list of passengers, a
 * queue of destination floors, and a record of last unloaded passengers. It
 * can move between floors, load and unload passengers, and maintain its queue
 * of destinations.
 */
public class CrazyElevator extends Elevator {

    /**
     * Constructs a new CrazyElevator with the specified parameters.
     * 
     * @param id         the unique identifier for the elevator
     * @param startFloor the floor where the elevator starts
     * @param capacity   the maximum number of passengers the elevator can carry
     */
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }

}