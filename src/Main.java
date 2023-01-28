public class Main {
    public static void main(String[] args) {
//      TreePrinter printer = new TreePrinter(30);
//      printer.print();
//        KobeLogoPrinter kobe = new KobeLogoPrinter(30);
//        kobe.printLogo();
        WelcomeBot welcome = new WelcomeBot("Miuccia");
        welcome.sayWelcome();

        WelcomeBotAdvanced welcomeBotAdvanced = new WelcomeBotAdvanced("Miuccia");
        welcomeBotAdvanced.sayWelcomeWithAuthor();
    }
}