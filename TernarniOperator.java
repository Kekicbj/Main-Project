package TernarniOperator;

public class TernarniOperator {
    public static void main(String[] args) {
        int age = 15;
        String message = (age < 18) ? "You can't enter" : "Welcome";
        System.out.println(message);
        // ukoliko je uslov ispunjen dodeli ponudjenu vrednost koja odgovara, u protivnom drugu
    }
}
