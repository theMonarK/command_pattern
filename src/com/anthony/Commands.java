package com.anthony;

import com.anthony.Command;

public class Commands implements Command {

    Command[] commands;

    public Commands(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command:this.commands
             ) {
            command.execute();
        }
    }

    @Override
    public void cancel() {
        for (Command command: this.commands
             ) {
            command.cancel();
        }
    }
}
