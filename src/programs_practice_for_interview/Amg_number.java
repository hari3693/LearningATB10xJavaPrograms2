package programs_practice_for_interview;

import java.util.Scanner;

class Amg_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        // Store the original number for comparison later
        int i = n;
        int amstrong = 0;
        int rem;
        int a = 0;
        while (i > 0) {
            i = i / 10;
            a++;
        }
        i = originalNum; // Reset i to the original number before the second loop
            while (i > 0) {
                rem = i % 10;
                amstrong = (int) Math.pow(rem, a) + amstrong;
                i = i / 10;
            }
            if (amstrong == originalNum)
            {
                System.out.println("armstrong");
            }
            else
            {
                System.out.println("not armstrong");
            }
        sc.close(); // close the scanner object
        }
    }
