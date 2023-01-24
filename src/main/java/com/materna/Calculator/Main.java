package com.materna.Calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> variables = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        loop(scanner, variables);
    }

    public static void loop(Scanner scanner, HashMap variables) {
        String expression = "";
        while (!expression.equals("exit")) {
            System.out.print("> ");
            expression = scanner.next();

            if (expression.contains("=")) {
                String[] variable = expression.split("=");
                setVariable(variable, variables);
                expression = variable[1];
            }

            double result = calculate(expression);
            String asString = String.valueOf(result);

            if (asString.substring(asString.indexOf("."), asString.length()).equals(".0")) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }

        }
    }

    public static double calculate(String expression) {
        Expression e = new ExpressionBuilder(expression).build();
        return e.evaluate();
    }

    public static void setVariable(String[] variable, HashMap variables) {
        variables.put(variable[0], variable[1]);
    }
}
