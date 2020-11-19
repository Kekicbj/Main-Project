package DoWhile;

public class DoWhile {
    public static void main(String[] args) {
        // ukoliko hocemo da se blok koda izvrsi makar jednom i ako uslov nije izvrsen
        // koristimo do..while
        int x = 6;
        do {
            System.out.println( " Hello World");
            x = x + 1;
        } while (x < 5);
    }
}
