public class CreditPaymentService {
    public double calculate(double interestRate, int loanAmountRub, int periodOfTime) {
        double monthlyPayment;
        monthlyPayment = (loanAmountRub * interestRate) / (1 - Math.pow(1 + interestRate, - periodOfTime));
        monthlyPayment = Math.round(monthlyPayment * 100) / 100;
        return monthlyPayment;
    }
}
