package primer2;

import java.util.Scanner;

public class Primer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite Temperaturu za Dan 1");
        int a = in.nextInt();
        System.out.println("Unesite Temperaturu za Dan 2");
        int b = in.nextInt();
        System.out.println("Unesite Temperaturu za Dan 3");
        int c = in.nextInt();
        double d = (a + b + c)/3.0;
        System.out.format("Prosecna Dnevna Temperatura za Tri Dana je %.3f" ,d);
    }
}
