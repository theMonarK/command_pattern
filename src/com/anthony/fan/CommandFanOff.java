package com.anthony.fan;

import com.anthony.Command;

public class CommandFanOff implements Command {

    Fan fan;

    public CommandFanOff(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.off();
    }
}
