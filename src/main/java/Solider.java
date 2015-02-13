/**
 * Created by Senela on 15-2-11.
 */
public class Solider extends Player{

    private WeaponInterface weapon;
    private int offense;


    public Solider(String name, int bloodValue, int attack, WeaponInterface weapon) {
        super(name, bloodValue, attack);
        sort = "战士";
        this.weapon = weapon;
        this.offense = weapon.getOffense();

    }


    public  void  setOffense(int offense)
    {
        this.offense = offense;
    }

    public int getAttack()
    {
        return  attack+offense;
    }

    public  String getNameDescribe()
    {
        return sort + name;
    }

    public  String weaponName()
    {
        return weapon.getWeaponName();
    }
}
