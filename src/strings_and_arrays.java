import java.util.Arrays;
public class strings_and_arrays {
    public static void main(String[] args) {
//        String s = "Hello World";
//        String s1 = "Hello World";
        //s = "Welcome";
        //String s1 = new String("Hello World");
//        String s2 = new String("Hello World");
        String s = "Hello World , this is chitti";
        String sub = s.substring(6, 11);
        System.out.println(sub);
        String[] s1 = s.split(", ");
        String f = "   You are welcome   ";
        System.out.println(f);
        System.out.println(f.charAt(6));
        System.out.println(f.indexOf("Y"));
        System.out.println(f.trim());
        String d = "Enter your name";
        String d1 = "Ram";
        String d2 = "Raju";
        System.out.println(d.concat(d1));
        System.out.println(d+d1+d2);
        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println(s.length());

        //System.out.println(s);
       // Boolean b = s.equals(s1);
       // System.out.println(b);
//        System.out.println(s == s1); // false
//        System.out.println(s.equals(s1));
    }
}
