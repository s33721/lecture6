public class Student {
    private int id;
    private String name;
    private String address;
    private int numberOfItns;
    private double monthlyPayment;
    private PaymentGateway paymentGateway;
    public Student(int id, String name, PaymentGateway paymentGateway) {
        this.id = id;
        this.name = name;
        this.paymentGateway = paymentGateway;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfItns() {
        return numberOfItns;
    }

    public void setNumberOfItns(int numberOfItns) {
        this.numberOfItns = numberOfItns;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
