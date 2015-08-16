package ru.lesson.lessons;

/**
 * Created by Den on 05.08.2015.
 */
public class ArgRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3,4,5);
        System.out.println(calculator.getResult());
    }
}
