public class encap0 {
    // String user;   // we modify the username in encap001 class  because the username is not private in encap0 class
    //  String pass;   // we modify the password in encap001 class  because the password is not private in encap0 class
    private String user;
    private String pass;     // Now right click on the encap0 class and select generate and select getter and setter and select all the variables and click on ok to
    // generate the getter() and setter() methods
    public encap0(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getPass(Boolean Admin) { // Authentication is set to get the password
        if (Admin) {
            return pass;
        } else {
            return "You are not Authorised to get the password";
        }
    }

    public Boolean setPass(String pass, Boolean password) {  // Authentication is set to change the password
        if (password) {
            this.pass = pass;  // Now you can access the Data members of this class(encap0) by using getter() only in the encap001 class
            return true;
        }
            System.out.println("You are not Authorised to set the password");
            return false;
    }

    public String getUser(Boolean Admin) { // Authentication is set to get the username
        if (Admin) {
            return user;    // Now you can access the Data members of this class(encap0) by using getter() only in the encap001 class
        } else {
            return "You are not Authorised to get the username";
        }
    }

    public Boolean setUser(String user, Boolean password) {
        if (password) {
            this.user = user;  // Now you can access the Data members of this class(encap0) by using getter() only in the encap001 class
            return true;
        }
        System.out.println("You are not Authorised to set the username");
        return false;

    }








}
