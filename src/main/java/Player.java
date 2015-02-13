/**
 * Created by Senela on 15-2-11.
 */
public class Player {
    protected String sort;
    protected int bloodValue;
    protected int attack;
    protected String name;


    public Player(String name, int bloodValue, int attack) {
        this.name = name;
        this.bloodValue = bloodValue;
        this.attack = attack;
        this.sort = "普通人";
    }

    public String getSort()
    {
        return sort;
    }

    public String attack(Player gamerTwo)
    {
        int blood = gamerTwo.getBloodValue()-getAttack() ;
        gamerTwo.setBloodValue(blood);
        String result = getName()+"攻击了"+gamerTwo.getName()+","+gamerTwo.getName()+"受到了"+getAttack()+"点伤害,"+gamerTwo.getName()+"剩余生命："+gamerTwo.getBloodValue();
        return result;
    }

    public int getBloodValue(){
        return bloodValue;
    }

    public void setBloodValue(int bloodValue) {
        this.bloodValue = bloodValue;
    }

    public String getName() {
        return name;
    }


    public int getAttack()
    {
        return  attack;
    }

    public  String getNameDescribe() {

            return  sort+name;
    }

    public  String  weaponName()
    {
        return "";
    }
}
