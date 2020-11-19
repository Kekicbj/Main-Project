package BrakeContinu;

public class BrakeContinue {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <100; i++) {
            if (i > 50) {
                continue;
                // continue prelazi na sledacu iteraciju
                // dok brake napusta petlju i prelazi se na naradbu
            }
            System.out.println(i);
        }

        System.out.println(i);
    }
}
