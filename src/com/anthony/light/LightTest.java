package com.anthony.light;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightTest {

    Light bedroomLight = new Light("bedroom");

    @Test
    void on() {
        this.bedroomLight.on();
        assertEquals(true,this.bedroomLight.getState());
    }

    @Test
    void off() {
        this.bedroomLight.off();
        assertEquals(false,this.bedroomLight.getState());
    }
}