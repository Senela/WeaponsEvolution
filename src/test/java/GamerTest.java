
import org.junit.Test;

import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Senela on 15-2-9.
 */
public class GamerTest {

    @Test
    public void should_gamer_has_blood_value() {
        Gamer gamerOne = new Gamer("gamer", 10);
        assertThat(gamerOne.getBloodValue()).isGreaterThan(0);

    }

    @Test
    public void should_gamer_has_name() {
        Gamer gamer = new Gamer("gamer", 10);
        assertThat(gamer.getName()).isEqualTo("gamer");
    }

    @Test
    public void should_gamer_has_attack_capability() {
        Gamer gamerOne = new Gamer("one", 10);
        Gamer gamerTwo = new Gamer("two", 10);
        gamerOne.attacked(gamerTwo);

        assertThat(gamerOne.getBloodValue()).isGreaterThan(gamerTwo.getBloodValue());
    }

    @Test
    public void should_gamer_not_has_defense_capability(){

        Gamer gamerOne = new Gamer("one", 10);
        Gamer gamerTwo = new Gamer("two", 10);
        int bloodValue = gamerOne.getBloodValue();
        gamerOne.attacked(gamerTwo);
        int bloodValueAfterAttacked = gamerTwo.getBloodValue();
        assertThat(bloodValue).isGreaterThan(bloodValueAfterAttacked);
    }

}