public interface Employee {
    //we cannot add fields to an interface
    String getFirstName();

    String getLastName();

    double calculateSalary();

    String getAddress();
    //we can only define public abstract classes with no implementation
    //the methods are public abstract by default, we don't have to write it
}
