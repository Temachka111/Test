import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Console Calculator in Java\n");

        System.out.print("Ввидите первое число: ");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ввидите второе число: ");
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Какое действие воспроизвести с этими числами?\n");
        System.out.println("\t1 - Сумма");
        System.out.println("\t2 - Разность");
        System.out.println("\t3 - Умножение");
        System.out.println("\t4 - Деление\n");
        System.out.print("Твое решение?\n ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                double res1 = num1 + num2;
                System.out.printf("Твой ответ: " + num1 + " + " + num2 + " = " + res1);
                break;
            case "2":
                double res2 = num1 - num2;
                System.out.printf("Твой ответ: " + num1 + " - " + num2 + " = " + res2);
                break;
            case "3":
                double res3 = num1 * num2;
                System.out.printf("Твой ответ: " + num1 + " * " + num2 + " = " + res3);
                break;
            case "4":
                if (num2 != 0) {
                    double res4 = num1 / num2;
                    System.out.printf("Твой ответ: " + num1 + " / " + num2 + " = " + res4);
                } else {
                    System.out.println("Ошибка: На ноль делить нельзя!");
                }
                break;
            default:
                System.out.println("Не корректное действие!");
        }
        System.out.print("\nНажмите \"Enter\" чтобы закончить действие калькулятора");
        scanner.nextLine();
        scanner.close();
    }
}