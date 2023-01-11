package com.materna.exercises.digits;

public class sumOfTheDigits {
    public static void main(String[] args) {
    System.out.print(digitSum(1485));
    }
    static int digitSum(String value) {
        int sum = 0;

        for (int i=0;i<value.length();i++)  {
            sum += Character.getNumericValue(value.charAt(i));
        }
        return sum;
    }

    static int digitSum(long value) {
        String str = String.valueOf(value);
        return digitSum(str);
    }
}
