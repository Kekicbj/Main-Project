package SwitchKaoIzraz;

public class Yield {
    public static void main(String[] args) {
        // yield se koristi za definisanje vrednosti koja je dodeljena promenljivoj
// kad se switch koristi kao izraz
        int value = 0;
        String stringValue = switch (value) {
            case 0:
                yield  "No";
            case 1 :
                yield  "Yes";
            default:
                yield "";
// na kraju mora da se stavi ;
        };
    }
}
