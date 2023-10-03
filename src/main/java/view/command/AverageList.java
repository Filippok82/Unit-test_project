package view.command;

import view.Console;

public class AverageList extends Command{
    public AverageList(Console console) {
        super(console);

    }

    public String getDescription(){
        return "Сравнить среднее значение списков";
    }

    public void execute(){
        console.averageListConsole();
    }
}
