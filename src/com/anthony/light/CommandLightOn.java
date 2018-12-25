package com.anthony.light;

import com.anthony.Command;

public class CommandLightOn implements Command {

    Light light;

    public CommandLightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void cancel() {
        this.light.off();
    }
}
