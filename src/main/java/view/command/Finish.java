package view.command;

import view.Console;

public class Finish extends Command {
    public Finish(Console console) {
        super(console);
    }

    public String getDescription(){
        return "Выйти";
    }

    public void execute(){
        console.finish();
    }
}
