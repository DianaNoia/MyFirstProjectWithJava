package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int income =  (202 + 118 + 2250 + 1680 + 1075 + 80);
        System.out.println("Earned amount:\nBubblegum: $202\nToffee: $118\nIce cream: $2250\n" +
                "Milk chocolate: $1680\nDoughnut: $1075\nPancake: $80");

        System.out.println("\n\nIncome: $" + income);

        System.out.println("Input staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Input other expenses:");
        int otherExpenses = scanner.nextInt();

        int netIncome = (income - (staffExpenses + otherExpenses));

        System.out.printf("Staff expenses:\n $%d", staffExpenses);
        System.out.printf("\nOther expenses:\n $%d", otherExpenses);
        System.out.printf("\nNet income: $%d", netIncome);
    }
}