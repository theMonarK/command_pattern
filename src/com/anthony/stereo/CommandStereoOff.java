package com.anthony.stereo;

import com.anthony.Command;

public class CommandStereoOff implements Command {

    Stereo stereo;

    public CommandStereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }

    @Override
    public void cancel() {
        this.stereo.on();
    }
}
