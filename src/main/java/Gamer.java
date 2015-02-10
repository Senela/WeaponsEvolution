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


    public void attacked(Gamer gamerTwo)
    {
        int blood = gamerTwo.getBloodValue()-attack;
        gamerTwo.bloodValue = blood;
    }

    public int getBloodValue(){
        return bloodValue;
    }


    public String getName() {
        return name;
    }
}
