public class Loan {
    double principal;
    double rate;
    double year;
    int number;

    public Loan(double P, double r, double y, int n) {
        this.principal = P;
        this.rate = r / 100;
        this.year = y;
        this.number = n;
    }

    double calculateSimpleInterest() {
        return principal + (principal * rate * year);
    }

    double calculateTotalRepayment() {
        return principal * Math.pow(1 + (rate / number), number * year);
    }
}