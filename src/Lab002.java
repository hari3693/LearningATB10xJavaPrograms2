import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Lab002 {
    public static void main(String[] args) {
       // String str = "Hello World55554367";
       // System.out.println(str.contains("zzz")); // check whether the string contains "zzz" or not
       // System.out.println(str.indexOf("H"));  // return the index of the first occurrence of the character "H"
        //System.out.println(str.lastIndexOf("l")); // return the index of last occurance of the character "l"
        //System.out.println(str.charAt(0)); // return the character at index 0
        //System.out.println(str.charAt(str.length() - 1)); // return the last character in the string
       // System.out.println(str.substring(0, 5)); // return the substring from index 0 to 5
      //  System.out.println(str.length()); // return the length of the string
        //System.out.println(str.replace("Hello", "Universe")); // replace the string "Hello" with "Universe"
       //System.out.println(str.replaceAll("l", "z"));  // replace all the occurrences of "l" with "z"
       // System.out.println(str.replaceAll("\\d+", "")); // removes all the numbers in the numbers im the string
       // System.out.println(str.toUpperCase()); // convert the string to uppercase
       // System.out.println(str.toLowerCase()); // Convert the string to lowercase
      //  System.out.println(str.trim()); // Removes the spaces at starting and ending of the string
     // System.out.println(str.startsWith("He"));  // check whether the string starts with "He" or not
     // System.out.println(str.endsWith("ld")); // Check whether the string ends with "ld" or not
     // System.out.println(str.isEmpty()); // Check whether the string is empty or not
     // System.out.println(str.isBlank()); // Check whether the string is blank or not
      //System.out.println(str.equals("Hello World")); // Check whether the string is equal to "Hello World" or not
     // System.out.println(str.equalsIgnoreCase("hello world"));  // Check whether the string is equal to "Hello world" or not
     //StringBuffer f = new StringBuffer("Hari Kumar");
     //StringBuffer s = f.append(str);
     //System.out.println(s.reverse());
     //f.reverse();
       // int [] a = {50,60,80,49,70,90};
       // System.out.println(a[0]);
       // System.out.println(a[1]);
        //System.out.println(a[20]);  // ArrayIndexOutOfBoundsException
       //  System.out.println(a.length);   // return the length of the array
      //  for (int i = 0; i < a.length; i++) {
        //    System.out.println(a[i]);
     //   int [] b = new int[5];
      //  b[0] = 10;
       // b[1] = 20;
       // b[2] = 30;
       // b[3] = 40;
       // b[4] = 50;
      //  System.out.println(b[0]);  prints the value of array at the index [0] position
       // String [] b = {"Hari","Kumar","Sai","Ram","Raj","Suresh"};
        int [] i = {10,20,77,46,15};
        int max = i[0];
        for(int j = 1; j < i.length; j++) {
            if (i[j] > max) {

                System.out.println(i[j]);
            }
        }
           // System.out.println(i[j]);
         // prints the values in the array (i
       // System.out.println(Arrays.toString(i));
       // Arrays.sort(i);
//        for (int j = i.length-1; j < 0; j--) {
//            System.out.println(j(i));
//        }
        //System.out.println(Arrays.toString(i));
       //System.out.println(i[0]);
      // System.out.println(i[4]);
    }
}
