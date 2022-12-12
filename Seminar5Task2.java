//Задача 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
//Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Seminar5Task2 {
    private static void numberOfRepetitions(List<String> userName) {
        int count = 1;
        for (int i = 0; i < userName.size() - 1; i++) {
            if (userName.get(i).equals(userName.get(i + 1)))
                count++;
            else {
                System.out.println(userName.get(i) + " повторяется:" + count);
                count = 1;
            }
        }
    }

    public static void main(String[] args) {
        String[] strarray = "Гавинова,Ершова,Гавинова,Барабанова,Васильев,Ершова,Ершова".split(",");
        List<String> userName = new ArrayList<>();
        for (int i = 0; i < strarray.length; i++)
            userName.add(strarray[i]);
        Collections.sort(userName, Collections.reverseOrder());
        System.out.println(userName.toString());
        numberOfRepetitions(userName);
    }
}
