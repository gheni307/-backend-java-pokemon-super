public class FirePokemon extends Pokemon{

    private String attack;
    private int leve1;

    public FirePokemon(String name, int level, int hp, String food, String sound, String attack, int leve1) {
        super(name, level, hp, food, sound);
        this.attack = attack;
        this.leve1 = leve1;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getLeve1() {
        return leve1;
    }

    public void setLeve1(int leve1) {
        this.leve1 = leve1;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eet " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " zegt " + getSound());
    }

    public void pyroBall(){
        System.out.println("pyro ball is level " + getLeve1() + " attack power of " + getName());
    }

    public void fireLash(){
        System.out.println("fire lash is level" + getLeve1() + " attack power of " + getName());
    }
}
