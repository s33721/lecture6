public class Developer implements Employee {
    //class will not compile without those methods
    private String firstName;
    private String lastName;
    private String address;
    private int numberOfHours;
    private double hourRate;


    public Developer(String firstName, String lastName, int numberOfHours, double hourRate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfHours = numberOfHours;
        this.hourRate = hourRate;
        this.address = address;
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
        return numberOfHours * hourRate;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
