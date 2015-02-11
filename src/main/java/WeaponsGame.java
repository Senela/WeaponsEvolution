import java.io.PrintStream;

/**
 * Created by Senela on 15-2-11.
 */
public class WeaponsGame {
    private Gamer gamerOne;
    private Gamer gamerTwo;
    private PrintStream out;

    public WeaponsGame(Gamer gamerOne, Gamer gamerTwo, PrintStream printStream) {
        this.gamerOne = gamerOne;
        this.gamerTwo = gamerTwo;
        this.out = printStream;
    }

    public void play() {

        while (gamerOne.getBloodValue()>0 && gamerTwo.getBloodValue()>0)
        {
            out.println( gamerOne.attack(gamerTwo) );
            if(gamerTwo.getBloodValue() >0)
                out.println(gamerTwo.attack(gamerOne));
        }

        showLoser(gamerOne, gamerTwo);
    }

    public void showLoser(Gamer gamerOne, Gamer gamerTwo)
    {
        if(gamerOne.getBloodValue()>0)
            out.println(gamerTwo.getName()+"被打败了!");
        else
            out.println(gamerOne.getName()+"被打败了!");

    }

    public static void main(String[] args)
    {
        Gamer gamerOne = new Gamer("张三", 10, 8);
        Gamer gamerTwo = new Gamer("李四", 20, 9);
        WeaponsGame weaponsGame = new WeaponsGame(gamerOne, gamerTwo, new  PrintStream(System.out));

        weaponsGame.play();

    }
}
