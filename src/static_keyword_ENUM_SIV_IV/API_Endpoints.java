package static_keyword_ENUM_SIV_IV;

public enum API_Endpoints
{

        BASE_URL("https://google.com"),     //  Step 0: Create a enum class with constants
        LOGIN_PAGE("https://Amazon.com"),
        DASHBOARD_PAGE("https://flipkart.com"),
        CHATBOT_PAGE("https://qafox.net");

        private String name;  //  Step 1: Create a enum class with constants

        API_Endpoints(String name) //  Step 2:  Create a constructor to initialize the constants
        {
            this.name = name;
        }
        public String getName()    //  Step 3: Create a method to get the constants
        {
            return name;           //  Step 4: Call the method in the runner class
        }
    }

