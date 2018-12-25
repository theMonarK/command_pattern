package com.anthony.light;

import com.anthony.Command;

public class CommandLightOff implements Command {

    Light light;

    public CommandLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void cancel() {
        this.light.on();
    }
}

