package view;


import view.command.Command;
import view.command.Finish;
import view.command.RamdomList;
import view.command.AverageList;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> list;

    public Menu(Console console) {
        list = new ArrayList<>();

        list.add(new RamdomList(console));
        list.add(new AverageList(console));
        list.add(new Finish(console));
    }


    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(list.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(String choice) {
        list.get(Integer.parseInt(choice) - 1).execute();
    }
}