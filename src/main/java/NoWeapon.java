/**
 * Created by Senela on 15-2-11.
 */
public class NoWeapon implements WeaponInterface {

    @Override
    public String getWeaponName() {
        return "";
    }

    @Override
    public int getOffense(){
        return 0;
    };
}
