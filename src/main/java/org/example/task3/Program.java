package org.example.task3;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  В рамках выполнения задачи необходимо:
 * Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
 * Найдите человека с самым маленьким номером телефона
 * Найдите номер телефона человека чье имя самое большое в алфавитном
 */
public class Program {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("123456", "Иван");
        phonebook.put("199999999999", "Наталья");
        phonebook.put("1234", "Владимир");
        phonebook.put("777777", "Света");
        phonebook.put("5654789", "Ян");

        System.out.println(findByMinPhoneNumber(phonebook));
        System.out.println(findByMaxAlphabetName(phonebook));
    }


    public static String findByMinPhoneNumber(Map<String, String> phonebook){
        Set<Long> numbers = phonebook.keySet().stream().map(el -> Long.valueOf(el)).collect(Collectors.toSet());
        long number = numbers.stream().min(Comparator.naturalOrder()).get();
        return String.format("Наименьший номер: %s, владелец: %s",
                number, phonebook.get(String.valueOf(number)));
    }

    public static String findByMaxAlphabetName(Map<String, String> phonebook){
        Set< Map.Entry<String, String> > eliments = phonebook.entrySet();
        Map.Entry<String, String> name =  eliments.stream().max(
                (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get();
        return String.format("Наибольшее имя в алфовитном порядке: %s, номер телефона: %s",
                name.getValue(), name.getKey());
    }
}
