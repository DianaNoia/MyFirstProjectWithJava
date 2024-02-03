import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city1 = scanner.nextLine();

        System.out.println(city1.endsWith("burg"));
    }
}