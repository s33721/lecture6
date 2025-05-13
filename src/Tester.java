public class Tester implements Employee{

    private String firstName;
    private String lastName;
    private String address;
    private int numberOfHours;
    private double hourRate;


    public Tester(String firstName, String lastName, String address, int numberOfHours, double hourRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.numberOfHours = numberOfHours;
        this.hourRate = hourRate;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public double calculateSalary() {
        return numberOfHours * hourRate ;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
