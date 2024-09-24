package entities;

public class Champions {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champions(){}
    public Champions(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void takeDamage(Champions other){

    }
    public String status(){
        return "Vida= "
                + getLife()
                + "Armadura= "
                + getArmor();
    }
}
