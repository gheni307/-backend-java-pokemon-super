public class ElectricPokemon extends Pokemon {

    private String attack;
    private String level4;


    public ElectricPokemon(String name, int level, int hp, String food, String sound, String attack, String level4) {
        super(name, level, hp, food, sound);
        this.attack = attack;
        this.level4 = level4;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eet " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " speek " + getSound());
    }

    public void thunderPunch(){
        System.out.println(getName() + " attack with " + getAttack());
    }

    public void electroBall(){
        System.out.println(" thunder punch is of leve " + getLevel4() + " of " + getName());
    }
}
