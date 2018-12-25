package com.anthony;

public class Remote {

    Command[] remoteOnButton;
    Command[] remoteOffButton;

    public Remote() {
        this.remoteOffButton = new Command[7];
        this.remoteOnButton = new Command[7];
    }

    public void setCommand(int cmdplace, Command commandOn, Command commandOff){
        this.remoteOnButton[cmdplace] =  commandOn;
        this.remoteOffButton[cmdplace] = commandOff;
    }

    public void commandOnButton(int cmdPlace){
        this.remoteOnButton[cmdPlace].execute();
    }

    public void commandOffButton(int cmdPlace){
        this.remoteOffButton[cmdPlace].execute();
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
