package programs_practice_for_interview;

public class Palendrome {
    public static void main(String[] srgs)
    {
        {
            int original_number = 152;
            int temp = original_number;
            int reverse = 0;
            int rem;
            while(temp>0)
            {
                rem = temp%10;
                reverse = reverse * 10 + rem;
                temp = temp/10;
            }
            System.out.println(reverse);
            if(original_number==reverse)
            {
                System.out.println("palindrome");
            }
            else
            {
                System.out.println("not palindrome");
            }
        }
    }
}
