import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by Senela on 15-2-11.
 */
public class WeaponTest {

    private  Weapon weapon;

    @Before
    public  void setUp() {
        weapon = new Weapon("优质木棒", 2);
    }

    @Test
    public void should_weapon_has_name() {
        assertThat(weapon.getWeaponName()).contains("优质木棒");
    }

    @Test
    public void  should_weapon_has_Offense() {
        assertThat(weapon.getOffense()).isEqualTo(2);
    }
}
