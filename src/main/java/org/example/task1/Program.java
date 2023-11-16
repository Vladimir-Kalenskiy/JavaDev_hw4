package org.example.task1;

import java.util.*;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List
 * Отсортируйте коллекцию в алфавитном порядке
 * Отсортируйте коллекцию по количеству букв в слове
 * Разверните коллекцию
 */

public class Program {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Иван", "Сергей", "Александр", "Ирина", "Светлана"));
        sortByAlphabet(names);
        System.out.println(names);
        sortByLength(names);
        System.out.println(names);
        reverseList(names);
        System.out.println(names);
    }

    public static void sortByAlphabet(List<String> list) {
        Collections.sort(list);
    }

    public static void sortByLength(List<String> list){
        list.sort(Comparator.comparing((String::length)));
    }

    public static void reverseList(List<String> list){
        Collections.reverse(list);
    }
}
