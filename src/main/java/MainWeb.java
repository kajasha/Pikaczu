public class MainWeb {

    public static void main(String[] args) {

        //buisnes logic
        Pokemon pokemon = new Pokemon("Pikaczu", 100, 100);

        //user interface
        WebApplication webApplication = new WebApplication(pokemon);
        webApplication.startWebApp();
    }
}
