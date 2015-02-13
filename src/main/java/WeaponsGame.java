import java.io.PrintStream;

/**
 * Created by Senela on 15-2-11.
 */
public class WeaponsGame {
    private Player gamerOne;
    private Player gamerTwo;
    private PrintStream out;

    public WeaponsGame(Player gamerOne, Player gamerTwo, PrintStream printStream) {
        this.gamerOne = gamerOne;
        this.gamerTwo = gamerTwo;
        this.out = printStream;
    }

    public void play() {

        while (gamerOne.getBloodValue()>0 && gamerTwo.getBloodValue()>0) {
            gamerOne.attack(gamerTwo);
            printAttackInfo(gamerOne, gamerTwo);
            if(gamerTwo.getBloodValue() >0)
            {
                gamerTwo.attack(gamerOne);
                printAttackInfo(gamerTwo, gamerOne);
            }
        }

        showLoser(gamerOne, gamerTwo);
    }

    public  void printAttackInfo(Player gamerOne, Player gamerTwo)
    {
        String result = gamerOne.getNameDescribe()+gamerOne.weaponName()+"攻击了"+gamerTwo.getNameDescribe()+","+gamerTwo.getName()+"受到了"+gamerOne.getAttack()+"点伤害,"+gamerTwo.getName()+"剩余生命："+gamerTwo.getBloodValue();
        out.println(result);
    }

    public void showLoser(Player gamerOne, Player gamerTwo)
    {
        if(gamerOne.getBloodValue()>0)
            out.println(gamerTwo.getName()+"被打败了!");
        else
            out.println(gamerOne.getName()+"被打败了!");

    }

    public static void main(String[] args)
    {
        Weapon weapon = new Weapon("优质木棒", 2);
        Solider gamerOne = new Solider("张三", 10, 8, weapon);

        Player gamerTwo = new Player("李四", 20, 9);
        WeaponsGame weaponsGame = new WeaponsGame(gamerOne, gamerTwo, new  PrintStream(System.out));

        weaponsGame.play();

    }
}
