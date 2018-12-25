package test.com.anthony.garageDoor;

import com.anthony.garage.GarageDoor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageDoorTest {

    GarageDoor garageDoor = new GarageDoor();

    @BeforeEach
    void setUp() {
    }

    @Test
    void openDoor() {
        this.garageDoor.openDoor();
        assertEquals(true,this.garageDoor.getDoorIsOpen());
    }

    @Test
    void closeDoor() {
        this.garageDoor.closeDoor();
        assertEquals(false,this.garageDoor.getDoorIsOpen());
    }
}