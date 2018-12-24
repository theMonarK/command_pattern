package com.anthony;

public class Main {

    public static void main(String[] args) {
        SimpleRemote remote= new SimpleRemote();
        Light light = new Light();
        CommandLightOn lightOn = new CommandLightOn(light);
        remote.setLocation(lightOn);
        remote.executeCommand();

        GarageDoor garageDoor = new GarageDoor();
        CommandOpenGarageDoor commandOpenGarageDoor = new CommandOpenGarageDoor(garageDoor);
        remote.setLocation(commandOpenGarageDoor);
        remote.executeCommand();
    }
}
