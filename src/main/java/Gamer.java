/**
 * Created by Senela on 15-2-9.
 */
public class Gamer {

    private int bloodValue;
    private String name;


    public Gamer(String name, int bloodValue) {
        this.name = name;
        this.bloodValue = bloodValue;
    }

    public void attacked(Gamer gamerTwo)
    {
        int blood = gamerTwo.getBloodValue()-1;
        gamerTwo.bloodValue = blood;
    }

    public int getBloodValue(){
        return bloodValue;
    }


    public String getName() {
        return name;
    }
}
