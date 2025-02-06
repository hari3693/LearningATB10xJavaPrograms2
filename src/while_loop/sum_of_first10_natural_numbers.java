package while_loop;

public class sum_of_first10_natural_numbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
