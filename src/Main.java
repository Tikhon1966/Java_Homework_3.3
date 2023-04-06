public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumKredit = 1_000_000; // сумма кредита в рублях
        int numberOffMonth = 12; // срок кредита в месяцах
        double rate = 9.99; // ставка кредита в процентах годовых
        double annuitet = service.calculate(sumKredit, numberOffMonth, rate); // ежемесячный платеж в рублях
        System.out.println((int) annuitet);
    }
}