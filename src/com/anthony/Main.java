package com.anthony;

public class Main {

    public static void main(String[] args) {
        SimpleRemote remote= new SimpleRemote();
        Light light = new Light();
        CommandLightOn lightOn = new CommandLightOn(light);
        remote.setLocation(lightOn);
        remote.executeCommand();
    }
}
