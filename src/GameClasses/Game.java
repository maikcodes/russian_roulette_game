 package GameClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class Game {

    //Atributes ⬇
    private ArrayList<Player> players;
    private Revolver revolver;

    //Methods ⬇
    //Constructor
    public Game() {
    }

    public Game(ArrayList<Player> gamers, Revolver revolver) {
        this.players = gamers;
        this.revolver = revolver;
    }

    //Setters and Getters
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    //Game actions
    public boolean endGame(Player gamer) {
        return (gamer.isAlive());
    }

    public void round() {
        Iterator<Player> playerIterator = players.iterator();
        Player player;
        int round = 1;
        System.out.println("\nRound " + round + "\n");
        do {

            player = playerIterator.next();
            player.shoot(getRevolver());
            System.out.println(this.revolver.toString());
            if (player.isAlive()) {
                System.out.println(player.getName() + " shot himself, is alive!!!");
                this.revolver.nextBullet();
                if (!playerIterator.hasNext()) {
                    playerIterator = players.iterator();
                    round++;
                    System.out.println("\nRound " + round + "\n");
                }
            } else {
                System.out.println(player.getName() + " shot himself, is dead!!!");
            }

        } while (endGame(player));
    }

    //Game information
    @Override
    public String toString() {
        return "Game{" + "gamers=" + players + ", revolver=" + revolver + '}';
    }

}
