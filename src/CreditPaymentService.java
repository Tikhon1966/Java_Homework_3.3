public class CreditPaymentService {

    double calculate(int sumKredit, int numberOffMonth, double rate) {
        double baseOffDegree = (1 + rate / 1200);
        double annuitet = sumKredit * rate / 1200 * Math.pow(baseOffDegree, numberOffMonth) /
                (Math.pow(baseOffDegree, numberOffMonth) - 1);
        return (int) annuitet;
    }
}