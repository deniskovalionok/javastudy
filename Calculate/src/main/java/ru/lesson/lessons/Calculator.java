package ru.lesson.lessons;

/**
 * Created by Den on 05.08.2015.
 */
public class Calculator {

    private int result=0;

    /**
     * ����� ��������
     * �������� ��������� v1, v2
     * ���������� ��������� ����� v1 � v2
     */
    public static int summ(int v1, int v2){
        return v1+v2;
    }

    /**
     * ����� ���������
     * �������� ��������� v1, v2
     * ���������� ��������� ���������
     */
    public static int subst(int v1, int v2){
        return v1-v2;
    }

    /**
     * ����� ���������
     * �������� ��������� v1, v2
     * ���������� ��������� ��������� v1 � v2
     */
    public static int mul(int v1, int v2){
        return v1*v2;
    }

    /**
     * ����� �������
     * �������� ��������� v1,v2
     * ���������� ��������� �������
     * @throws UserException
     */
    public static double div(double v1, double v2) throws  UserException{
        if (v2 != 0)
        return v1/v2;
        else throw new UserException("Null");
    }

    /**
     * ����� ���������� � �������
     * �������� ��������� v1, v2
     * ���������� ��������� ���������� � �������
     */
    public static double deg(int v1, int v2){
        return Math.pow(v1,v2);
    }

    /**
     * ����� ��������
     * �������� ��������� params
     * ������������ ��������� ������������
     */
    public void add (int ... params){
        for (Integer param: params){
            this.result+=param;
        }
    }

    /**
     * ����� ����������� ���������
     * ���������� ���������
     */
    public int getResult(){
        return this.result;
    }

}
