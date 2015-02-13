import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by Senela on 15-2-11.
 */
public class PlayerTest {
    private Player gamerOne;
    private Player gamerTwo;

    @Before
    public void setUp() {
        gamerOne = new Player("张三", 100, 8);
        gamerTwo = new Player("李四", 100, 8);
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


    @Test
    public void should_gamer_has_gamer_sort(){

        assertThat(gamerOne.sort).isEqualTo("普通人");
    }

}
