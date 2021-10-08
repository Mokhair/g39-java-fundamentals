package org.example;


import java.util.Scanner;

import static org.example.calculator.calculate;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a number");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter an operator");
        String operator = scanner.nextLine();

        double result = calculate(num1, num2, operator);
        System.out.println(result);
    }
}



