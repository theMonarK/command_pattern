package com.anthony;

import com.anthony.fan.CommandFanOff;
import com.anthony.fan.CommandFanOn;
import com.anthony.fan.Fan;
import com.anthony.garage.CommandCloseGarageDoor;
import com.anthony.light.CommandLightOff;
import com.anthony.light.CommandLightOn;
import com.anthony.light.Light;
import com.anthony.garage.CommandOpenGarageDoor;
import com.anthony.garage.GarageDoor;
import com.anthony.stereo.CommandStereoOff;
import com.anthony.stereo.CommandStereoOnWithCd;
import com.anthony.stereo.Stereo;

public class Main {

    public static void main(String[] args) {
        Remote remote= new Remote();

        //Init subject
        Light lightBedroom = new Light("Bedroom");
        Light lightKitchen = new Light("Kitchen");
        Stereo stereoBedroom = new Stereo("Bedroom");
        Fan fanBedroom = new Fan("Bedroom");
        GarageDoor garageDoor = new GarageDoor();

        // Init light commands
        CommandLightOn bedroomLightOn = new CommandLightOn(lightBedroom);
        CommandLightOff bedroomLightOff = new CommandLightOff(lightBedroom);
        CommandLightOn kitchenLightOn = new CommandLightOn(lightKitchen);
        CommandLightOff kitchenLightOff = new CommandLightOff(lightKitchen);

        // Init lights command
        Command[] lightOnGroup = {bedroomLightOn,kitchenLightOn};
        Command[] lightOffGroup = {bedroomLightOff,kitchenLightOff};
        Commands allLightsOn = new Commands(lightOnGroup);
        Commands allLightsOff = new Commands(lightOffGroup);

        // Init stereo commands
        CommandStereoOnWithCd stereoBedroomOn = new CommandStereoOnWithCd(stereoBedroom);
        CommandStereoOff stereoBedroomOff = new CommandStereoOff(stereoBedroom);

        // Init garage door commands
        CommandOpenGarageDoor openGarageDoor = new CommandOpenGarageDoor(garageDoor);
        CommandCloseGarageDoor closeGarageDoor = new CommandCloseGarageDoor(garageDoor);

        // Init fan commands
        CommandFanOn bedroomFanOn = new CommandFanOn(fanBedroom);
        CommandFanOff bedroomFanOff = new CommandFanOff(fanBedroom);

        // Set commands to the remote
        remote.setCommand(0,bedroomLightOn,bedroomLightOff);
        remote.setCommand(1,kitchenLightOn,kitchenLightOff);
        remote.setCommand(2,stereoBedroomOn,stereoBedroomOff);
        remote.setCommand(3,openGarageDoor,closeGarageDoor);
        remote.setCommand(4,bedroomFanOn,bedroomFanOff);
        remote.setCommand(5,allLightsOn,allLightsOff);

        // Print all remote buttons
        System.out.println(remote);

        // Try buttons
        remote.commandOnButton(0);
        remote.commandOffButton(0);
        remote.commandOnButton(1);
        remote.commandOffButton(1);
        remote.commandOnButton(2);
        remote.commandOffButton(2);
        remote.commandOnButton(3);
        remote.commandOffButton(3);
        remote.commandOnButton(4);
        remote.commandOffButton(4);
        remote.commandOnButton(5);
        remote.commandOffButton(5);

    }
}
