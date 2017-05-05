import javax.swing.*;

/**
 * A class defining the Player
 */
public class Player extends Creature{

    private static final int PLAYER_HP = 5;
    private static final int PLAYER_ATTACK = 1;
    private static final int STARTING_GOLD = 1000;

    public Player(){
        super(Player.PLAYER_HP);
        this.gold = Player.STARTING_GOLD;
    }

    @Override
    public ImageIcon getImageIcon(){
        return new ImageIcon("assets/daeva.png");
    }

    @Override
    public void encounterCreature(Creature creature){
        creature.hurt(PLAYER_ATTACK);
    }

    @Override
    public void takeTurn(GameBoard gameBoard, Location location){
        // Player movement is controlled in GameController
    }

}
