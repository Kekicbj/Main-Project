package VisestrukoPoklapanje;

public class Visestruko {
    public static void main(String[] args) {
        // x ce se dobiti ukoliko je 1 ili dva
        // u slucaju da ima neki drugu vrednost izvrsice se default

        int x = 1;

        switch (x) {
            case 1:
            case 2:
                System.out.println("Yes");
                break;
            default:
                System.out.println("NO");
        }
    }
}
