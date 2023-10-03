package presenter;

import model.service.Service;
import view.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.service = new Service();
        this.view = view;
    }

    public String randomList(String size) {
        Integer s = Integer.parseInt(size);
        String answer = service.randomListService(s).toString();
        view.print(answer);
        return answer;
    }

    public void averageList() {
        String answer = service.getAverageList();
        view.print(answer);

    }
}




