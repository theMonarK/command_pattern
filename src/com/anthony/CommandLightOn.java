package com.anthony;

public class CommandLightOn implements Command {

    Light light;

    public CommandLightOn(com.anthony.Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
