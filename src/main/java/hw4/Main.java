package hw4;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {
        EmpDirectory directory = new EmpDirectory();
        directory.addEmp(1, "Иван", "123456", 5);
        directory.addEmp(2, "Петр", "112233", 2);
        directory.addEmp(3, "Светлана", "445566", 1);
        directory.addEmp(4, "Владимир", "888888", 7);
        directory.addEmp(5, "Наталья", "987654", 5);

        System.out.println(directory.findByExp(5).toString().
                replace("[", "").replace(", ","") .replace("]",""));

        System.out.println(directory.findPhoneNumByName("Владимир").toString().
                replace("[", "").replace("]",""));

        System.out.println(directory.findEmpById(2).toString().
                replace("[", "").replace("]",""));
    }

}
