public class WaterPokemon extends Pokemon{

    private String attack;
    private int level1;
    public WaterPokemon(String name, int level, int hp, String food, String sound, String attack, int level1) {
        super(name, level, hp, food, sound);
        this.attack = attack;
        this.level1 = level1;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getLevel1() {
        return level1;
    }

    public void setLevel1(int level1) {
        this.level1 = level1;
    }

    @Override
    public void eats() {

    }

    @Override
    public void speaks() {

    }

    public void surf(){
        System.out.println("surf is leve " + getLevel1() + " attack power of " + getName());
    }

    public void hydroPump(){
        System.out.println("hydro pump is level " +  getLevel() + " attack power of " + getName());
    }
}
