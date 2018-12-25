package com.anthony.fan;

public class Fan {

    String room;

    public Fan(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println(String.format("Fan %s on!",this.room));
    }

    public void off(){
        System.out.println(String.format("Fan %s off",this.room));
    }
}
