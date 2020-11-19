package primer3;

import java.util.Scanner;

public class Primer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite Temperaturu za Dan 1");
        double t1 = in.nextDouble();
        System.out.println("Unesite Temperaturu za Dan 2");
        double t2 = in.nextDouble();
        System.out.println("Unesite Temperaturu za Dan 3");
        double t3 = in.nextDouble();
        double prosek = (t1 + t2 + t3)/3;
        System.out.format("Prosecna Dnevna Temperatura za Tri Dana je %.3f" ,prosek);
    }
}
