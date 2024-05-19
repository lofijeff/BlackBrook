import enteties.*;
import art.*;
import java.util.Random;
import java.util.Scanner;

public class BattleMethods {
  Fiend fiend = new Fiend();
  Player player = new Player();
  SplashScreens splashScreen = new SplashScreens();
  int choice;
  Scanner scan = new Scanner(System.in);

  public void battleLevelOne(Battle battle) {
    Random random = new Random();
    int randomFiend = random.nextInt(5) + 1;

    switch (randomFiend) {
      case 1:
        battle.setFiend(fiend);
        goblinBattle(battle);
        break;
    }
  }

  public void goblinBattle(Battle battle) {
    System.out.println("         ~~~~ " + battle.getPlayer().getName().toUpperCase() + " VS GOBLIN ~~~~");
    splashScreen.fight();
    int choice;
    int fiendHealth = battle.getFiend().getCurrentHealth();
    int fiendHit = battle.getFiend().getDamage();
    int playerHealth = battle.getPlayer().getCurrentHealth();
    int playerHit = battle.getPlayer().getDamage();
    while (fiendHealth <= 0 || playerHealth <= 0) {

      System.out.println("SLAGGIS! 1 = hit 2 = defend 3 = flee??");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          fiendHealth -= generateDamage(player);
          System.out.println(battle.getFiend().getName() + " took " + playerHit + " damage!");
          break;
        case 2:
          playerHealth -= fiendHit;
          break;
      }
    }
  }

  public int generateDamage(Player player) {
    Random random = new Random();
    int randomInt = random.nextInt(100) + 1;
    if (randomInt >= 55 && player.getType().equals("thief")) {
      return player.getWeapon().getCriticalDamage();
    }
    if (randomInt >= 80 && (player.getType().equals("witch") || player.getType().equals("soldier"))) {
      return player.getWeapon().getCriticalDamage();
    } else {
      return player.getWeapon().getDamage();
    }
  }
}
