public class WelcomeBot {
    String welcomeMessage= " Welcome!!!";
    String userName;
    public WelcomeBot(String name){
        userName=name;
    }
    void sayWelcome(){
        System.out.println( userName + welcomeMessage);
    }
}

