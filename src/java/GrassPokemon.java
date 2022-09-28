public class GrassPokemon extends Pokemon {

    private String attack;
    private String leve1;

    public GrassPokemon(String name, int level, int hp, String food, String sound, String attack, String leve1) {
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

    public String getLeve1() {
        return leve1;
    }

    public void setLeve1(String leve1) {
        this.leve1 = leve1;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eet " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " speek " + getSound());
    }

    public void leechSeed(){
        System.out.println("leech seed is "+ getLeve1() + " attack power of " + getName());
    }

    public void solarBeam(){
        System.out.println("solar beam is " + getLeve1() + "attack power of " + getName());
    }

}
