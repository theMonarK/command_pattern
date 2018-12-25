package com.anthony.fan;

import com.anthony.Command;

public class CommandFanOn implements Command {

    Fan fan;

    public CommandFanOn(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.on();
    }

    @Override
    public void cancel() {
        this.fan.off();
    }
}
