import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in US dollars (e.g. 100.50 or 100,50): ");
        String input = scanner.nextLine();
        double dollars = 0;

        try{
            dollars = Double.parseDouble(input.replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter a number with a decimal point (e.g. 100.50).");
            return;
        }

        double choiceConversionRate = 0;
        String currency = "";
        switch (choice) {
            case 1:
                choiceConversionRate = 0.83;
                currency = "Euros";
                break;
            case 2:
                choiceConversionRate = 0.71;
                currency = "British Pounds";
                break;
            case 3:
                choiceConversionRate = 109.33;
                currency = "Japanese Yen";
                break;
            case 4:
                choiceConversionRate = 1.27;
                currency = "Canadian Dollars";
                break;
            case 5:
                choiceConversionRate = 50.52;
                currency = "Philippine Pesos";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        double result = dollars * choiceConversionRate;
        System.out.printf("%.2f US dollars is equal to %.2f %s.%n", dollars, result, currency);
    }
}