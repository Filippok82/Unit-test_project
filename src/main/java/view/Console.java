package view;


import model.AverageComparison;
import model.NumberList;
import presenter.Presenter;

import java.util.Scanner;


public class Console implements View {

    private Presenter presenter;
    private Scanner scanner;
    private Menu menu;
    private boolean work;

    public Console() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.print());
            String choice = scanner.nextLine();
            menu.execute(choice);
        }
    }


    public void randomListConsole() {
        System.out.println("Размер списка");
        String size = scanner.nextLine();
        presenter.randomList(size);
    }

    public void averageListConsole() {
        presenter.averageList();
    }

    public void finish() {
        System.out.println("До новых встреч");
        work = false;
    }
}
