import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

/**
 * Created by Senela on 15-2-11.
 */
public class SoliderTest {

    @Test
    public void should_solider_has_solider_sort(){

        NoWeapon noWeapon = new NoWeapon();
        Solider solider = new Solider("张三", 20, 8, noWeapon);
        assertThat(solider.sort).isEqualTo("战士");
    }



}

