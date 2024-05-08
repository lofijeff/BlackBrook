import enteties.Fiend;
import enteties.Player;

public class Battle {
  private Fiend fiend;
  private Player player;
  // int enemy;

  public Battle() {
  }

  public Battle(Player player, Fiend fiend) {
    this.player = player;
    this.fiend = fiend;
  }

  public Fiend getFiend() {
    return fiend;
  }

  public void setFiend(Fiend fiend) {
    this.fiend = fiend;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}
