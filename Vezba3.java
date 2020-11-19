package Vezba3;

public class Vezba3 {
    public static void main(String[] args) {
        /* u ovom primeru upotrebljen je jedan switch konstrukcija
        koja se nalazi unutar drugog switch bloka
         */

        String carMaker = " Ford ";
        int doors = 4;
        // outer (spoljasnji) switch
        switch (carMaker) {
            case " Ford ":
                // inner (unutrasnji) switch
                switch (doors) {
                    case 3 :
                        System.out.println("You drive a Ford with three doors");
                        break;
                    case 4:
                        System.out.println("You drive a Ford with four doors");
                        break;
                    case 5:
                        System.out.println("You drive a Ford with five doors");
                        break;
                    default: // default pripada spoljasnjem ili outer switch
                        System.out.println("We are sorry. You don't drive a Ford car.");
                }
        }
    }
}
