import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double v1 = scn.nextDouble();
        int v2 = scn.nextInt();
        System.out.println(Math.round(Math.pow(10,v2)*v1)/Math.pow(10,v2));
    }
}
