package com.anthony.fan;

public class Fan {

    String room;

    public Fan(String room) {
        this.room = room;
    }

    public String on(){
        String returnString=String.format("Fan %s on!",this.room);
        System.out.println(returnString);
        return returnString;
    }

    public String off(){
        String returnString=String.format("Fan %s off!",this.room);
        System.out.println(returnString);
        return returnString;
    }
}
