
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.security.PublicKey;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Senela on 15-2-9.
 */
public class GamerTest {

    private Gamer gamerOne;
    private Gamer gamerTwo;

    @Before
    public void setUp() {
        gamerOne = new Gamer("张三", 100, 8);
        gamerTwo = new Gamer("李四", 100, 8);
    }

    @Test
    public void should_gamer_has_blood_value() {

        assertThat(gamerOne.getBloodValue()).isGreaterThan(0);

    }

    @Test
    public void should_gamer_has_name() {

        assertThat(gamerOne.getName()).isEqualTo("张三");
    }

    @Test
    public void should_gamer_has_attack_capability() {
        gamerOne.attack(gamerTwo);

        assertThat(gamerOne.getBloodValue()).isGreaterThan(gamerTwo.getBloodValue());
    }

    @Test
    public void should_gamer_not_has_defense_capability() {

        int bloodValue = gamerOne.getBloodValue();
        gamerOne.attack(gamerTwo);
        int bloodValueAfterAttacked = gamerTwo.getBloodValue();
        assertThat(bloodValue).isGreaterThan(bloodValueAfterAttacked);

        bloodValue = gamerOne.getBloodValue();
        gamerOne.attack(gamerTwo);
        bloodValueAfterAttacked = gamerTwo.getBloodValue();
        assertThat(bloodValue).isGreaterThan(bloodValueAfterAttacked);


        bloodValue = gamerOne.getBloodValue();
        gamerOne.attack(gamerTwo);
        bloodValueAfterAttacked = gamerTwo.getBloodValue();
        assertThat(bloodValue).isGreaterThan(bloodValueAfterAttacked);
    }

}