import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}