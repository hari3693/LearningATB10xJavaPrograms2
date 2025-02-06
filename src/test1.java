public class test1{



    public static void main(String[] args) {
        test0 t = new test0("hari1233693@gmail.com", "Hari@369123");
       // t1.username = "kumar.hari324@gmail.com";   // We cant do this because username and password are Private
        //System.out.println(t1.username);
      //  t.username = "jhbcjbnkjs@gmail.com";  // we are changing the username
        System.out.println(t.getUsername(true));    // if we put username as private in test0 then we can access it by using getter()
//        System.out.println(t.getUsername());
//        //System.out.println(t.getUsername());
//        t.play();
        t.setUsername("heeralalhatdhj@gmail.com",false);
            // changing the username by using the setter()
        System.out.println(t.getUsername(true));// printing the changed username
        //t.setPassword("Hari@36912kjksj89070003", false); // you cant set password because Admin is false
       // String passs= t.getPassword(false);   // you cant get the password because the Admin is false
        System.out.println(t.getPassword(true));   // you can get the password because the Admin is true

        // System.out.println(t.setPassword("Hari@36jhjjjk91238u9", false));  // you cant set the password because the Admin is false
        t.setPassword("Hari@36jhjjjk91238u9", false);  // you can set the password because the Admin is true
        System.out.println(t.getPassword(true));  // Print the password after you set the new password


        //  String setp = "Naravayagahh123456788";
           // System.out.println(setp);

//        t.setPassword("Hari@3691238u9njkndksn787");
//        System.out.println(t.getPassword());
//        t.getUsername();
//        t.setPassword("Hari@3691238u9");
//        t.getPassword();
    }



}
