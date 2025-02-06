public class encap001 {
    public static void main(String[] args) {
        encap0 obej = new encap0("zzzzzz@gmail.com", "AAAAAAAA67489374983");
       // obj.user = "LLtrue);
        //
        //        System.out.println(obej.getPass(true));  // print the new password
        //        obej.setUser(false,false); // username is changed by using the setter method in the encap0 class
        //        setusername = "DAFBJNJKNKNNKLM@gmail.com";LLLLLLLL";   // we modified the username because the username is not private in encap0 class
      //  obj.pass = "KKKKKKKKKK";   // we modified the password because the password is not private in encap0 class
       // obej.user = "XXXXXXXXXX"; // Now we cant access the username because it is made private in the encap0 class
       // obej.pass = "KKKKKKKKKK"; // Now we cant access the password because it is made private in the encap0 class
      //  System.out.println(obj.user);  Mot possible because you changed the Data members in the encap0 class to private
      //  System.out.println(obj.pass);  Mot possible because you changed the Data members in the encap0 class to private
      //  System.out.println(obej.getUser());
          // Now you can access the Data members of this class(encap0) by using getter() only in the encap001 class
      //  System.out.println(obej.getPass());
        // Now you can access the Data members of this class(encap0) by using getter() only in the encap001 class
       String getusername = obej.getUser(true);  // if we give false then you get the username
        System.out.println(getusername);
       String getpassword = obej.getPass(true);
        System.out.println(getpassword);

        obej.setUser("Hari123456789@gmail.com", false);
          // if we give false then you cant change the username
        System.out.println(obej.getUser(true));

        obej.setPass("HARUIGHH45776778", false);
        System.out.println(obej.getPass(true));

    }
}
