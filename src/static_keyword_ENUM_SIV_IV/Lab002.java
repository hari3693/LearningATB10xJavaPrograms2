package static_keyword_ENUM_SIV_IV;

public class Lab002 {
    public static void main(String[] args) {
       String s = null;
        try {
            s.trim();  // We handled the "NullPointerException" by surrounding it with the Try and Catch
            // block Step 1: select the s.trim() 2. select surround option 3. select Try and Catch option
        } catch (Exception e) {
            System.out.println("We cant trim the String with null value" + " " + e);  // we are printing the exception message
         //   e.printStackTrace();  // we are printing the exception message with the line number
            System.out.println("end");
        }
        int a = 10;
        int b = 0;
        try {
            b = a/0;
        } catch (Exception e) {
            System.out.println("We cant divide the number with zero" + " " + e);
        }
        System.out.println("end");
    }
}
