/**
 * Created by Senela on 15-2-9.
 */
public class Gamer {

    private int bloodValue;
    private int attack;
    private String name;


    public Gamer(String name, int bloodValue, int attack) {
        this.name = name;
        this.bloodValue = bloodValue;
        this.attack = attack;
    }


    public String attack(Gamer gamerTwo)
    {
        int blood = gamerTwo.getBloodValue()-attack;
        gamerTwo.bloodValue = blood;

        String result = name+"攻击了"+gamerTwo.getName()+","+gamerTwo.getName()+"受到了"+attack+"点伤害,"+gamerTwo.getName()+"剩余生命："+gamerTwo.getBloodValue();
        return result;
    }

    public int getBloodValue(){
        return bloodValue;
    }


    public String getName() {
        return name;
    }
}
