package com.anthony;

public class Remote {

    Command[] remoteOnButton;
    Command[] remoteOffButton;
    Command remoteCancelButton;

    public Remote() {
        this.remoteOffButton = new Command[7];
        this.remoteOnButton = new Command[7];
        // Handle empty command with NoCommand
        for (int index=0; index<this.remoteOnButton.length; index++) {
            this.remoteOnButton[index]= new NoCommand();
            this.remoteOffButton[index] = new NoCommand();
        }
        this.remoteCancelButton = new NoCommand();
    }

    public void setCommand(int cmdplace, Command commandOn, Command commandOff){
        this.remoteOnButton[cmdplace] =  commandOn;
        this.remoteOffButton[cmdplace] = commandOff;
    }

    // Execute on button command
    public void commandOnButton(int cmdPlace){
        this.remoteOnButton[cmdPlace].execute();
        this.remoteCancelButton = this.remoteOnButton[cmdPlace];
    }

    // Execute off button command
    public void commandOffButton(int cmdPlace){
        this.remoteOffButton[cmdPlace].execute();
        this.remoteCancelButton = this.remoteOffButton[cmdPlace];
    }

    // Execute cancel button
    public void cancelButton(int cmdPlace){
        this.remoteCancelButton.cancel();
    }

    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----------Remote----------\n");
        for (int index=0; index<this.remoteOnButton.length; index++) {
            buffer.append(String.format("Location [%s]: %s %s \n",index,this.remoteOnButton[index],
                    this.remoteOffButton[index]));
        }
        return buffer.toString();
    }
}
