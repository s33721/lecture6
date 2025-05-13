import java.util.ArrayList;

public class Company {
    private String name;
    private String address;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
