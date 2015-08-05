import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Den on 05.08.2015.
 */
public class Calculate {
    public static void main(String[] arg) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int v1 = Integer.parseInt(reader.readLine());
        String operation1 = reader.readLine();
        int v2 = Integer.parseInt(reader.readLine());
        if (operation1.equals("+")) {
            System.out.println(summ(v1, v2));
        } else if (operation1.equals("-")){
            System.out.println(subst(v1,v2));
        } else if (operation1.equals("*")){
            System.out.println(mul(v1, v2));
        } else if (operation1.equals("/")){
            System.out.println(div(v1,v2));
        } else if (operation1.equals("^")) {
            System.out.println(deg(v1,v2));
        }
    }
     public static int summ(int v1, int v2){
        return v1+v2;
    }
    public static int subst(int v1, int v2){
        return v1-v2;
    }
    public static int mul(int v1, int v2){
       return v1*v2;
    }
    public static int div(int v1, int v2){
        return v1/v2;
    }
    public static double deg(int v1, int v2){
        return Math.pow(v1,v2);
    }
}
