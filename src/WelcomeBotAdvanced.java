public class WelcomeBotAdvanced extends WelcomeBot{
    String authorName = "M";
    public WelcomeBotAdvanced(String name) {
        super(name);
    }

    void sayWelcomeWithAuthor(){
        System.out.println(userName + welcomeMessage +"By "+authorName);
    }
}
