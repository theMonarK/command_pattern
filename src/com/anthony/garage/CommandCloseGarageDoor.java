package com.anthony.garage;

import com.anthony.Command;

public class CommandCloseGarageDoor implements Command {

    GarageDoor garageDoor;

    public CommandCloseGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.ligthOff();
        this.garageDoor.closeDoor();
    }

    @Override
    public void cancel() {
        this.garageDoor.closeDoor();
    }
}
