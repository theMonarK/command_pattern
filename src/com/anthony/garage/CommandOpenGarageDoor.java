package com.anthony.garage;

import com.anthony.Command;

public class CommandOpenGarageDoor implements Command {

    GarageDoor garageDoor;

    public CommandOpenGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.openDoor();
        this.garageDoor.lightOn();
    }
}
