package com.anthony.garage;

public class GarageDoor {

    Boolean doorIsOpen;

    public GarageDoor() {
        doorIsOpen = false;
    }

    public void openDoor(){
        if (!doorIsOpen) {
            System.out.println("Open garage door!");
            System.out.println("Garage door is open" );
            doorIsOpen = true;
        }
    }

    public void closeDoor(){
        if (doorIsOpen) {
            System.out.println("Close garage door!");
            this.stop();
            System.out.println("Garage door is close");
            doorIsOpen = false;
        }
    }

    public void stop(){
        System.out.println("Stop garage door!");
    }

    public void lightOn(){
        System.out.println("Garage light on!");
    }

    public void ligthOff(){
        System.out.println("Garage light off!");
    }

    public Boolean getDoorIsOpen() {
        return doorIsOpen;
    }
}
