package fr.ensai.elevator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ElevatorTest {

    /**
     * Tests the isFull method in the "full" case
     */
    @Test
    void isFull_true() {
        // GIVEN
        int elevatorCapacity = 5;
        Elevator elevator = new Elevator(0, 0, elevatorCapacity);
        elevator.fillWithRandomPassengers(elevatorCapacity);

        // WHEN
        boolean isFull = elevator.isFull();

        // THEN
        assertTrue(isFull);
    }

    /**
     * Tests the isFull method in the "non-full" case
     */
    @Test
    void isFull_false() {
        // GIVEN
        int elevatorCapacity = 5;
        Elevator elevator = new Elevator(0, 0, elevatorCapacity);
        elevator.fillWithRandomPassengers(elevatorCapacity - 1);

        // WHEN
        boolean isFull = elevator.isFull();

        // THEN
        assertFalse(isFull);
    }

    /**
     * Tests the addDestination method when adding a destination that is not already in the queue
     */
    @Test
    void addDestination_OK() {
        // GIVEN
        Elevator elevator = new Elevator(0, 0, 5);

        // WHEN
        int floorToAdd = 2;
        boolean queueContainsBefore = elevator.containDestination(floorToAdd);
        elevator.addDestination(floorToAdd);
        boolean queueContainsAfter = elevator.containDestination(floorToAdd);

        // THEN
        assertFalse(queueContainsBefore);
        assertTrue(queueContainsAfter);
    }

    /**
     * Tests the addDestination method when the destination is already in the queue
     */
    @Test
    void addDestination_already_exists() {
        // GIVEN
        Elevator elevator = new Elevator(0, 0, 5);
        int floorToAdd = 2;
        elevator.addDestination(floorToAdd);

        // WHEN
        int queueSizeBefore = elevator.getDestinationQueueSize();
        elevator.addDestination(floorToAdd);
        int queueSizeAfter = elevator.getDestinationQueueSize();

        // THEN
        assertEquals(queueSizeBefore, queueSizeAfter);
    }
}
