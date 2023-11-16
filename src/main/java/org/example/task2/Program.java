package org.example.task2;

import java.util.*;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
 * Получите уникальный список Set на основании List
 * Определите наименьший элемент (алфавитный порядок)
 * Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
 * Удалите все элементы содержащие букву ‘A’
 */
public class Program {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("Иван", "Сергей", "Александр", "Ирина", "Светлана", "Иван", "Светлана"));
        Set<String> setNames = convertListToSet(names);
        System.out.println(setNames);
        System.out.println("Наименьшее в алфавитном порядке имя: " + minLength(setNames));
        List<String> minAndMaxNames = maxAndMinLengthNames(setNames);
        System.out.println("Наименьшее по длине имя: " + minAndMaxNames.get(0) + "\n" +
                           "Наибольшее по длине имя: " + minAndMaxNames.get(1));

        removeNamesByChar(setNames, 'А');
        System.out.println("Коллекция после удаления (буква А): " + setNames);
    }

    public static Set<String> convertListToSet(List<String> list){
        return new HashSet<>(list);
    }

    public static String minLength(Set<String> names){
        return names.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static List<String> maxAndMinLengthNames(Set<String> names){
        List<String> resultNames = new ArrayList<>();
        resultNames.add(names.stream().min(Comparator.comparing(String::length)).orElse(null));
        resultNames.add(names.stream().max(Comparator.comparing(String::length)).orElse(null));
        return resultNames;
    }

    public static void removeNamesByChar(Set<String> names, char symbol){
        names.removeIf(name -> name.toLowerCase().contains(String.valueOf(symbol).toLowerCase()));
    }
}
