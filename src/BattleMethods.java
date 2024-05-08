
public class BattleMethods {
    Goblin goblin = new Goblin();
    Player player = new Player();
    SplashScreens splashScreen = new SplashScreens();

    public void battleLevelOne(Battle battle) {
        Random random = new Random();
        int randomFiend = random.nextInt(5) + 1;

        switch (randomFiend) {
            case 1:
                battle.setFiend(goblin);
                goblinBattle(battle);
                break;
        }
    }

    public void goblinBattle(Battle battle) {
        System.out.println("         ~~~~ " + battle.getPlayer().getName().toUpperCase() + " VS GOBLIN ~~~~");
        splashScreen.fight();
        System.out.println("");
    }
}