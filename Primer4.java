package Primer4;

import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Koliko imate godina?");
        int godine = in.nextInt();
        System.out.println("Kolika vam je plata");
        double plata = in.nextDouble();
        System.out.println("godine =" + godine);
        System.out.println("plata =" + plata);
    }
}
