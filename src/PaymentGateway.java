public interface PaymentGateway {
    public void setAccount(String setAccount);
    public void sendTransfer(String title, double Amount);
    }
}
