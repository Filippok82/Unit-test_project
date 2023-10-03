

import model.AverageComparison;
import model.NumberList;
import model.service.Service;
import presenter.Presenter;
import view.Menu;
import view.View;
import view.Console;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ListTest {


    /**
     * Тест на проверку размера списка
     */
    @Test
    public void testSizeList() {
        NumberList list = new NumberList();
        list.randomSetList(15);
        assertThat(list.getSize()).isEqualTo(15);
    }

    /**
     * Тест на проверку среднего значения списка
     */
    @Test
    public void testAverageValueList() {
        Integer[] array = {1, 2, 3, 4, 5};
        NumberList list = new NumberList(array);
        AverageComparison average = new AverageComparison();
        average.findAverage(list);
        assertEquals(3.0, average.findAverage(list));
    }

    /**
     * Тест на проверку среднего значения списков - значение первого больше
     */
    @Test
    public void testAverageFirstMore() {
        Integer[] l1 = {1, 2, 3, 4, 5}; //15.0
        Integer[] l2 = {1, 1, 2, 3, 4}; //11.0

        NumberList list1 = new NumberList();
        list1.setNumberList(l1);
        NumberList list2 = new NumberList(l2);

        AverageComparison aс = new AverageComparison();

        assertEquals("Среднее значение первого списка больше", aс.comparisonValues(list1, list2));
    }

    /**
     * Тест на проверку среднего значения списков - значение второго больше
     */
    @Test
    public void testAverageSecondMore() {
        Integer[] l1 = {1, 2, 3, 4, 5}; //11.0
        Integer[] l2 = {1, 1, 2, 3, 4}; //15.0

        NumberList list1 = new NumberList();
        list1.setNumberList(l1);
        NumberList list2 = new NumberList(l2);

        AverageComparison aс = new AverageComparison();

        assertEquals("Среднее значение первого списка больше", aс.comparisonValues(list1, list2));

    }

    /**
     * Тест на проверку среднего значения списков - значения равны
     */

    @Test
    public void testAverageValuesEqual() {
        Integer[] l1 = {1, 2, 3, 4, 5}; //15.0
        Integer[] l2 = {1, 2, 3, 4, 5}; //15.0

        NumberList list1 = new NumberList();
        list1.setNumberList(l1);
        NumberList list2 = new NumberList(l2);

        AverageComparison a1 = new AverageComparison();

        assertEquals("Средние значения списков равны", a1.comparisonValues(list1, list2));
    }

    /**
     * Тест на проверку отображения списка в виде строки
     */

    @Test
    public void testSetList() {
        NumberList numberList = new NumberList();
        Integer[] list = {1, 2, 3, 4, 5};
        numberList.setNumberList(list);
        assertThat(numberList.getInfo()).isEqualTo("Список чисел: 1, 2, 3, 4, 5, ");
    }

    /**
     * Тест на проверку отображения меню
     */

    @Test
    public void testMenu() {
        Console console = new Console();
        Menu menu = new Menu(console);

        assertThat(menu.print()).isEqualTo("1. Показать списки\n2. Сравнить среднее значение списков\n3. Выйти\n");
    }


    /**
     * Тест на проверку если списки с нулевым размером
     */
    @Test
    public void testNullSizeList() {
        Service service = new Service();
        NumberList list = new NumberList();

        list.randomSetList(0);

        assertEquals("нет данных", service.getAverageList());
    }

    /**
     * Тест на проверку если списки с нулевым средним значением
     */
    @Test
    public void testNullValueAverageList() {
        Integer[] array = {0, 0, 0, 0, 0};
        NumberList numberList = new NumberList(array);
        AverageComparison average = new AverageComparison();
        Service service = new Service();

        average.findAverage(numberList);


        assertEquals("нет данных", service.getAverageList());
    }


}
