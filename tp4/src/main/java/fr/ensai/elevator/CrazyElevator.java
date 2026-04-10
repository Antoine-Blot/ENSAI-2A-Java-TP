package fr.ensai.elevator;

import java.util.Random;

/**
 * Represents an elevator in a hotel simulation.
 * <p>
 * Each Elevator has an ID, capacity, current floor, a list of passengers, a
 * queue of destination floors, and a record of last unloaded passengers. It
 * can move between floors, load and unload passengers, and maintain its queue
 * of destinations.
 */
public class CrazyElevator extends Elevator {

    private static Random random = new Random();

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

    /**
     * The crazy elevator can, with equal probability:
     * - remain stationary
     * - skip its next destination and go directly to the next one
     * - go to the next floor as a normal elevator
     */
    @Override
    public void move() {
        int r = random.nextInt(3);
        switch(r) {
            case 0:
                // normal behavior
                super.move();
                break;
            case 1:
                // skip next destination and go to the next one
                if (!destinationQueue.isEmpty()) {
                    destinationQueue.removeFirst();
                }
                if (!destinationQueue.isEmpty()) {
                    this.currentFloor = destinationQueue.removeFirst();
                }
                break;
            default:
                // stationary
        }
    }

    /**
     * Half the time, the crazy elevator may decide not to unload its passengers.
     * Otherwise, it will unload passengers as a normal elevator.
     * 
     * @param floor the Floor where passengers will exit
     * @return the number of passengers unloaded
     */
    @Override
    public int unloadPassengers(Floor floor) {
        if (random.nextDouble() < 0.5) {
            return 0;
        } else {
            return super.unloadPassengers(floor);
        }
    }

    /**
     * Loads passengers as a normal elevator.
     * If it is full, it will send all its passengers into another dimension.
     * 
     * @param floor the Floor where passengers board the elevator
     */
    @Override
    public void loadPassengers(Floor floor) {
        super.loadPassengers(floor);

        if (isFull()) {
            for (Person p : passengers) {
                logger.info("{} has gone missing. They were last seen in Elevator {}.",
                        p.getNickname(),
                        id);
            }
            passengers.clear();
        }
    }
}
