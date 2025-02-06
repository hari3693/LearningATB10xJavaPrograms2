package Task_5_Feb;

public class Print_even_numbers_from_1_to_20 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
