package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static ru.lesson.lessons.Calculator.*;
import static ru.lesson.lessons.Calculator.deg;

public class InteractRunner {

    /**
     * ¬водим данные, вход€щие параметры v1, v2
     */
    public static void main(String[] arg) throws IOException {

        String repeat;
        do {
            int sum = 0;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter primary argument");
            int v1 = Integer.parseInt(reader.readLine());

            System.out.println("Enter operation");
            String operation = reader.readLine();

            System.out.println("Enter second argument");
            int v2 = Integer.parseInt(reader.readLine());

            if (operation.equals("+")) {
                System.out.println("Result = "+ summ(v1, v2));

            } else if (operation.equals("-")){
                System.out.println("Result = "+ subst(v1,v2));

            } else if (operation.equals("*")){
                System.out.println("Result = "+mul(v1, v2));

            } else if (operation.equals("/")){
                try {
                    System.out.println("Result = "+div(v1,v2));
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please enter new orgument");
                }

            } else if (operation.equals("^")) {
                System.out.println("Result = "+deg(v1,v2));
            }

            System.out.println("More enter? yes/no");
            repeat = reader.readLine();

        } while (repeat.equals("yes"));

       }
       }
