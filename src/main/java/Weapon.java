/**
 * Created by Senela on 15-2-11.
 */
public class Weapon implements WeaponInterface{
    private String weaponName;
    private int offense;
    
    public Weapon(String name, int Offense) {
        this.weaponName = name;
        offense = Offense;
    }

    public String getWeaponName() {
        return "用" + weaponName;
    }

    public int getOffense() {
        return offense;
    }
}
