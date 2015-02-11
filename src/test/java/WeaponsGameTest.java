
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by Senela on 15-2-11.
 */
public class WeaponsGameTest {

    private  Gamer gamerOne;
    private  Gamer gamerTwo;
    private   PrintStream out;
    @Before
    public  void setUp()
    {
        gamerOne = new Gamer("张三", 10, 8);
        gamerTwo = new Gamer("李四", 20, 9);
        out = mock(PrintStream.class);
    }

    @Test
    public void  should_one_gamer_will_die() {

        WeaponsGame weaponsGame = new WeaponsGame(gamerOne, gamerTwo, out);

        verify(out, never()).println("张三被打败了!");
        weaponsGame.play();

        verify(out).println("张三被打败了!");
    }


    @Test
    public  void should_print_detail_attack_info()
    {
        String result =  gamerOne.attack(gamerTwo);
        assertThat(result).isEqualTo("张三攻击了李四,李四受到了8点伤害,李四剩余生命：12");
    }

    @Test
    public void should_print_detail_attack_info_step_by_step() {

        WeaponsGame weaponsGame = new WeaponsGame(gamerOne, gamerTwo, out);
        weaponsGame.play();

        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("张三攻击了李四,李四受到了8点伤害,李四剩余生命：12");
        inOrder.verify(out).println("李四攻击了张三,张三受到了9点伤害,张三剩余生命：1");
        inOrder.verify(out).println("张三攻击了李四,李四受到了8点伤害,李四剩余生命：4");
        inOrder.verify(out).println("李四攻击了张三,张三受到了9点伤害,张三剩余生命：-8");
        inOrder.verify(out).println("张三被打败了!");

    }
}
