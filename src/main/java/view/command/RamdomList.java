package view.command;

import view.Console;

public class RamdomList extends Command {

    public RamdomList(Console console) {
        super(console);

    }

    public String getDescription() {
        return "Показать списки";
    }

    public void execute() {
        console.randomListConsole();
    }

}
