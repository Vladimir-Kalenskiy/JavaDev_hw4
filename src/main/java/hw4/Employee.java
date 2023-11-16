package hw4;

public class Employee {
    private int id;
    private String name;
    private String phonenumber;
    private int experience;

    public Employee(int id, String name, String phonenumber, int experience) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Табельный номер сотрудника: " + id +
                "; Имя сотрудника: " + name +
                "; Номер телефона: " + phonenumber +
                "; Стаж работы: " + experience + ".\n";
    }
}
