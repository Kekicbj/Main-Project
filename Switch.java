public class Switch {
    public static void main(String[] args) {
        // svaki case mora da ima brake u switch naredbi

        int x = 1;
        switch (x) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("unknown value");
                break;
        }
    }
}
