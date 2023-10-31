package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть операцію (add, subtract, multiply, divide). 'exit' для виходу:");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            System.out.println("Введіть перше число:");
            int a = scanner.nextInt();

            System.out.println("Введіть друге число:");
            int b = scanner.nextInt();

            switch (operation) {
                case "add" -> System.out.println("Результат: " + calculator.add(a, b));
                case "subtract" -> System.out.println("Результат: " + calculator.subtract(a, b));
                case "multiply" -> System.out.println("Результат: " + calculator.multiply(a, b));
                case "divide" -> {
                    try {
                        System.out.println("Результат: " + calculator.divide(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("Помилка: " + e.getMessage());
                    }
                }
                default -> System.out.println("Невірна операція. Спробуйте ще раз.");
            }

            scanner.nextLine();
        }

        System.out.println("Калькулятор вимкнуто");
        scanner.close();
    }
}