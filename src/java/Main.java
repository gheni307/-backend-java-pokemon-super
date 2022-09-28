public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu",
                1, 35, "kaas", "pikachu", "thunder punch", "4");
        pikachu.eats();
        pikachu.speaks();
        pikachu.thunderPunch();
        pikachu.electroBall();

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 45,
                "seed", "bulbasaur", "leech Seed", "1");
        bulbasaur.eats();
        bulbasaur.speaks();
        bulbasaur.leechSeed();
        bulbasaur.solarBeam();

        WaterPokemon evolutions = new WaterPokemon("Evolutions", 1, 79,
                "water", "evolution", "Hydro Pump", 1);
        evolutions.eats();
        evolutions.speaks();
        evolutions.hydroPump();
        evolutions.surf();

        FirePokemon charmander = new FirePokemon("Charmander", 1, 39,
                "fire", "charmander", "pyroBall", 1);

        charmander.eats();
        charmander.speaks();
        charmander.fireLash();
        charmander.pyroBall();

    }
}
