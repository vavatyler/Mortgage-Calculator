

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: " );
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        float monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_YEAR;
        int totalPayments = period * MONTHS_IN_YEAR;

        double total = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        String totalFormatted = NumberFormat.getCurrencyInstance().format(total);
        System.out.println("Your total is: " + totalFormatted);
    }

}