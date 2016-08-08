public class WebApplication {

    private Pokemon pokemon;

    public WebApplication(Pokemon pokemon) {
        this.pokemon = pokemon;

    }

    public void startWebApp() {
        createPokemonPage();

    }
    private void createPokemonPage() {
        get("/pokemon", (req, res) -> {

        });
    }
}
