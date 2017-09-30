import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();//g
        System.out.println(Math.round((a/600f)*10)/10f);
    }
}
