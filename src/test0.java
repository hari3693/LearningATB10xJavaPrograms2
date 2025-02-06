public class test0 {
    public String getUsername(Boolean Admin) {
        if(Admin) {
            return username;
        }
        else {
            return "You are not allowed";
        }
    }

    public Boolean setUsername(String username, Boolean Admin) {
        if(Admin) {
            this.username = username;
            return true;
        }
            System.out.println("You are not allowed");
            return false;
    }

    public String getPassword(Boolean Admin) {
        if(Admin) {
            return password;
        }
        return "None";
    }

    public Boolean setPassword(String password, Boolean Admin) {
        if(Admin) {
            this.password = password;
            return true;
        }
       System.out.println("You are not allowed");
        return false;
    }

    private String username;
    private String password;

    public test0(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void play() {
        System.out.println("cat is playing");
    }

    public static void main(String[] args) {


//        System.out.println(t.username);
//        System.out.println(t.password);
//        t.play();

    }
}
