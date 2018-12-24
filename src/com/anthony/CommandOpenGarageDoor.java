package com.anthony;

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
