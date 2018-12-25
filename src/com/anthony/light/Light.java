package com.anthony.light;

public class Light {

    Boolean state;
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(String.format("%s light On!",this.room));
    }

    public void off() {
        System.out.println(String.format("%s light Off!",this.room));
    }
}
