package SwitchKaoIzraz;

public class SwitchKaoIzraz{
    public static void main(String[] args) {
        int value = 1;
        String stringValue = "";
        switch (value) {
            case 0:
                stringValue = "No";
                break;
            case 1:
                stringValue = "Yes";
                break;
            default: System.out.println("Invalid Value");
        }
        System.out.println(stringValue);
    }
}
