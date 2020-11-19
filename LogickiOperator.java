package LogickiOperator;

public class LogickiOperator {
    public static void main(String[] args) {
        int value = 1;
        int value2 = 2;
        System.out.println((value == 1 && value2 == 2));
        System.out.println((value == 1 || value2 == 2));
        System.out.println((value == 1 && value2 == 3));
        System.out.println((value ==1 || value2 == 3));
        // jedan true i jedan false u kombinaciji sa AND (&&) operatorom proizvode false
        // a u kombinaciji sa OR (||) daju true

    }
}
