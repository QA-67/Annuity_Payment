public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmountRub = 1_000_000;
        int periodOfTime = 3 * 12;
        double interestRate = (9.99 / 100) / 12;
    double  annuityPayment = service.calculate(interestRate, loanAmountRub, periodOfTime);
        System.out.println(annuityPayment);
    }
}