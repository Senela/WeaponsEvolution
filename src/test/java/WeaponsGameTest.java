
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Senela on 15-2-11.
 */
public class WeaponsGameTest {

    @Test
    public void  should_one_gamer_will_die() {

        Gamer gamerOne = new Gamer("张三", 10);
        Gamer gamerTwo = new Gamer("李四", 5);
        PrintStream out = mock(PrintStream.class);

        WeaponsGame weaponsGame = new WeaponsGame(gamerOne, gamerTwo, out);

        weaponsGame.play();
    }



}
