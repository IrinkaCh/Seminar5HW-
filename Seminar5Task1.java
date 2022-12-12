//Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Seminar5Task1 {
    public static void main(String[] args) {
        Map<String, String> foneBook = new HashMap<>();
        foneBook.put("Петров И.В.", "3 - 49 - 28");
        foneBook.put("Нестеров И.Г.", "3 - 75 - 13");
        foneBook.put("Нестеров И.Г.", "2 - 11 - 36");
        foneBook.put("Нестерова Р.Г.", "2 - 71 - 36");
        foneBook.put("Минеева М.А.", "2 - 55 - 62");
        foneBook.put("Габова Э.В.", "2 - 04 - 20");
        foneBook.put("Сидорова Н.Н", "2 - 80 - 23");
        foneBook.put("Гавинова А.Д.", "3 - 99 - 00");
        foneBook.put("Гавинова А.Д.", "2 - 43 - 79");
        System.out.println(foneBook.get("Петров И.В."));
        System.out.println(foneBook.get("Гавинова А.Д."));

        addFoneBook(foneBook, "Ершов К.С.", "2 - 58 - 96");
        System.out.println(foneBook.get("Ершов К.С."));
        deleteoneBook(foneBook, "Петров И.В");
        System.out.println(foneBook);
    }

    public static void addFoneBook(Map<String, String> dict, String userName, String number) {
        dict.put(userName, number);
    }

    public static void deleteoneBook(Map<String, String> dict, String userName) {
        dict.remove(userName);
    }
}
