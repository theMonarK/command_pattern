package com.anthony;

public class SimpleRemote {

    Command location;

    public SimpleRemote() {
    }

    public void setLocation(Command location) {
        this.location = location;
    }

    public void executeCommand(){
        this.location.execute();
    }
}
