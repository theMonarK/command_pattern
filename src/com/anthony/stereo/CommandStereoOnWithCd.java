package com.anthony.stereo;

import com.anthony.Command;

public class CommandStereoOnWithCd implements Command {

    Stereo stereo;

    public CommandStereoOnWithCd(Stereo stereo) {
        this.stereo = stereo;
    }

    public void setCd(Cd cd){
        this.stereo.setCd(cd);
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd(new Cd("Guns n' Roses","Appetite for destruction"));
        this.stereo.setVolume(11);
    }
}
