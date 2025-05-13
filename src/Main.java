public class Main {
    public static void main(String[] args) {
        //we cannot write an instance of an interface
        //Employee e = new Employee(); wouldn't work just like with abstract class
        Employee e = new Developer("John", "Doe", 8, 30, "Koszykowa");
        Tester t = new Tester("Johny","Doey", "Koszykowa", 8, 25);

        Company c = new Company("Pjatk");
        c.addEmployee(e);
        c.addEmployee(t);
        //IoC - Inversion of Control
        Student s = new Student(33721, "John", "Paypal");

    }
}