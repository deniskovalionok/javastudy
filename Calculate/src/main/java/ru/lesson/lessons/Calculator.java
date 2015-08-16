package ru.lesson.lessons;

/**
 * Created by Den on 05.08.2015.
 */
public class Calculator {

    private int result=0;

    /**
     * Метод сложения
     * Входящие параметры v1, v2
     * Возвращаем результат суммы v1 и v2
     */
    public static int summ(int v1, int v2){
        return v1+v2;
    }

    /**
     * Метод вычитания
     * Входящие параметры v1, v2
     * Возвращает результат вычитания
     */
    public static int subst(int v1, int v2){
        return v1-v2;
    }

    /**
     * Метод умножения
     * Входящие параметры v1, v2
     * Возвращает результат умножения v1 и v2
     */
    public static int mul(int v1, int v2){
        return v1*v2;
    }

    /**
     * Метод деления
     * Входящие параметры v1,v2
     * Возвращает результат деления
     * @throws UserException
     */
    public static double div(double v1, double v2) throws  UserException{
        if (v2 != 0)
        return v1/v2;
        else throw new UserException("Null");
    }

    /**
     * Метод возведения в степень
     * Входящие параметры v1, v2
     * Возвращает результат возведения в степень
     */
    public static double deg(int v1, int v2){
        return Math.pow(v1,v2);
    }

    /**
     * Метод сложения
     * Входящие параметры params
     * Возвращается результат суммирования
     */
    public void add (int ... params){
        for (Integer param: params){
            this.result+=param;
        }
    }

    /**
     * Метод возвращения результат
     * Возвращает результат
     */
    public int getResult(){
        return this.result;
    }

}
