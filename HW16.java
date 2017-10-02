import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        System.out.println((double) 3.14*Math.pow(r,2)*h);
    }
}
