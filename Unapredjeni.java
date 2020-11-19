package UnapredjeniSwitch;

public class Unapredjeni {
    public static void main(String[] args) {
        // unapredjeni switch
        int x = 1 ;
        switch (x) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            default -> System.out.println("unknown value");

            // mnogo je laske koristiti unapredjeni switch za visestruko poklapanje
        }
        int y = 4;
        switch (y){
            case 1,2,3 -> System.out.println("Yes");
            default -> System.out.println("No");
        }
    }
}
