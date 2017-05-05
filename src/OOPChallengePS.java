import javax.swing.ImageIcon;


public class OOPChallengePS{

    /*** This problem set is designed to add functionality in the form of different enemy types to the
     * Lab 12/13 game. Once complete, you can add this code to you game project with only minor alterations
     ***/

    /***
     * Note: We are abusing inner classes in this assignment by defining multiple classes inside the
     * OOPChallengePS class. To use this code in the Lab 12/13 project you should split your solution code
     * into separate files such that each class is defined in a different file.
     ***/

    /***
     * This problem set will demonstrate a useful application of interfaces by applying the state design
     * pattern (https://en.wikipedia.org/wiki/State_pattern). We will create new creatures to be used in
     * the Lab 12/13 game with their behavior being defined by an EnemyState interface. Each enemy will
     * store an instance variable of type EnemyState and set it to a instance of a class that implements
     * this interface. EnemyState has one method, takeTurn, which will be called in the enemies takeTurn
     * method. In this way, the enemies behavior will depend on the current value of their state. When
     * an enemy changes state, the value of state is set to an new instance of one of the state classes.
     ***/


    // 2 point  Q1: Implement the RandomWalk state to move thisCreature either up, down, left, or right by 1 position.
    //           Each of the 4 directions should have [close to] an equal probability of being chosen
    // 1 point  Q2: Set the default state of a Rat to sleeping by setting its state to a new instance of Sleeping
    //           that is used in the rat's takeTurn method to define its current behavior
    // 2 points Q3: After a rat takes 5 turns it should "wake up" and start randomly walking by setting its state to a
    //           a new instance of RandomWalk
    // 1 point  Q4: Implement Rat's encounterCreature method to deal 1 damage to the creature (you can call the creature's
    //           hurt method

    // 2 points Q5: Complete the Thief class using a structure similar to the Rat class with max hp of 3, attack
    //           is 1, and the state is always RandomWalk
    // 1 point  Q6: When a Thief encounters a creature, remove 100 gold from that creature in addition to dealing
    //           1 damage to that creature

    // 3 points Q7: Implement the Hunting state to always attempt to move closer to the target creature. This can
    //           be done using only distance calculations based on the position of the creatures
    //           (ie. you don't have to move around walls which would be a much more difficult question task)
    // 3 points Q8: Implement the IceDragon to have a max hp of 5, attack of 2, initial state of sleeping, and the
    //           state changes to hunting a creature whenever a creature is encountered


    /**
     * Enemies in the sleeping state do nothing. There is nothing more to add to this class
     */
    public class Sleeping implements EnemyState{

        @Override
        public void takeTurn(Creature thisCreature, GameBoard gameBoard, Location location){}
    }


    /**
     * The enemy randomly wanders the game board
     */
    public class RandomWalk implements EnemyState{

        // Implement the RandomWalk state to move thisCreature either up, down, left, or right by 1 position.
        // Each of the 4 directions should have [close to] an equal probability of being chosen

        @Override
        public void takeTurn(Creature thisCreature, GameBoard gameBoard, Location location){

        }
    }


    /**
     * A basic Rat
     */
    public class Rat extends Creature{

        private static final int RAT_HP = 1;
        private EnemyState state;

        public Rat(){
            super(Rat.RAT_HP);

            // Set the default state of a Rat to sleeping by setting its state to a new instance of Sleeping
            // that is used in the rat's takeTurn method to define its current behavior

        }

        @Override
        public void takeTurn(GameBoard gameBoard, Location location){
            // After a rat takes 5 turns it should "wake up" and start randomly walking by setting its state to a
            // a new instance of RandomWalk

            // Use the following line as an example of using states
//            this.state.takeTurn(this, gameBoard, location);
        }

        @Override
        public void encounterCreature(Creature creature){
            // Implement Rat's encounterCreature method to deal 1 damage to the creature (you can call the creature's
            // hurt method to deal damage)
        }

        @Override
        public ImageIcon getImageIcon(){
            return new ImageIcon("assets/grey_rat.png");
        }
    }


    /**
     * A thief takes gold in addition to dealing damage
     */
    public class Thief extends Creature{

        // Complete the Thief class using a structure similar to the Rat class with max hp of 3, attack
        // is 1, and the state is always RandomWalk

        private EnemyState state;

        public Thief(){
            super(0);
        }

        @Override
        public void takeTurn(GameBoard gameBoard, Location location){

        }

        @Override
        public void encounterCreature(Creature creature){
            // When a Thief encounters a creature, remove 100 gold from that creature in addition to dealing
            // 1 damage to that creature

        }

        @Override
        public ImageIcon getImageIcon(){
            return new ImageIcon("assets/deformed_orc.png");
        }
    }


    /**
     * The enemy will attempt to move closer to the target creature each turn
     */
    public class Hunting implements EnemyState{

        // Implement the Hunting state to always attempt to move closer to the target creature. This can
        // be done using only distance calculations based on the position of the creatures
        // (ie. you don't have to move around walls which would be a much more difficult question task)

        public Hunting(Creature creatureToHunt){

        }

        @Override
        public void takeTurn(Creature thisCreature, GameBoard gameBoard, Location location){

        }
    }


    /**
     * Never wake a sleeping dragon
     */
    public class IceDragon extends Creature{

        // Implement the IceDragon to have a max hp of 5, attack of 2, initial state of sleeping, and the
        // state changes to hunting a creature whenever a creature is encountered

        private EnemyState state;

        public IceDragon(){
            super(0);
        }

        @Override
        public void takeTurn(GameBoard gameBoard, Location location){

        }

        @Override
        public void encounterCreature(Creature creature){

        }

        @Override
        public ImageIcon getImageIcon(){
            return new ImageIcon("assets/ice_dragon.png");
        }
    }


}
