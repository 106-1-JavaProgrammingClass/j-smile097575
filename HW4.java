import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int C = scn.nextInt();
        int M = scn.nextInt();
        int E = scn.nextInt();
        System.out.println(C+M+E);
        System.out.println((C+M+E)/3);
    }
}
