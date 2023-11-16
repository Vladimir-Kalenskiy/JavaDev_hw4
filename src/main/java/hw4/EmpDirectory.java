package hw4;

import java.util.ArrayList;
import java.util.List;

public class EmpDirectory {
    private List<Employee> dirEmp = new ArrayList<>();

    protected void addEmp(int id, String name, String phoneNumber, int exp){
        dirEmp.add(new Employee(id, name, phoneNumber, exp));
    }

    protected List<Employee> findByExp(int exp){
        return dirEmp.stream().filter(employee -> employee.getExperience() == exp).toList();
    }

    protected List<String> findPhoneNumByName(String name){
        List<String> result = new ArrayList<>();
        dirEmp.forEach(employee -> {
            if(employee.getName().equals(name)){
                result.add(employee.getName());
                result.add(employee.getPhonenumber());
            }
        });
        return result;
    }

    protected List<Employee> findEmpById(int id){
        return dirEmp.stream().filter(employee -> employee.getId() == id).toList();
    }

}
