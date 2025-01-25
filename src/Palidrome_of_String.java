public class Palidrome_of_String {
    public static void main(String[] args) {
        String str = "ramu";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palidrome");
        } else {
            System.out.println("Not Palidrome");
        }
    }
}
