package primer1;

import java.util.Scanner;

public class PovrsinaPravugaonika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite a:");
        int a= in.nextInt();
        System.out.println("Unesite b:");
        int b= in.nextInt();
        int c= a * b;
        System.out.println("Proizvod je " + c + ".");

    }
}
