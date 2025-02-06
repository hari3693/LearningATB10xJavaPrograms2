public class amm {
    public static void main(String[] args) {
        int n = 153;
        int rem;
        int x;
        int temp = 0;
        int i;
        for (i = 0; i < n; i++) {
            rem = n % 10;
            x = (int) Math.pow(rem,rem);
            temp = x + temp;
            temp = x;
            n = n / 10;

        }
        System.out.println(temp);
    }
}
