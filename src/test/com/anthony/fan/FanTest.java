package test.com.anthony.fan;

import com.anthony.fan.Fan;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {

    Fan fan = new Fan("bedroom");

    @org.junit.jupiter.api.Test
    void testOn() {
        assertEquals("Fan bedroom on!",this.fan.on());
    }

    @org.junit.jupiter.api.Test
    void testOff() {
        assertEquals("Fan bedroom off!",this.fan.off());
    }
}