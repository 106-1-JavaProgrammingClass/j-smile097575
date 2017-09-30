import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();//l
        System.out.println(Math.round((a*0.26418f)*10)/10f);
    }
}
