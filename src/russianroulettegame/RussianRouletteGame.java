package russianroulettegame;

import GameClasses.Game;
import GameClasses.Player;
import GameClasses.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class RussianRouletteGame {

    public static void main(String[] args) {

        //variables and instances
        int numberPlayers, playerAdd = 1;

        ArrayList<Player> players = new ArrayList<>();
        Player player;
        Game game;

        //Start menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to most funny game");
        System.out.println("Russian Roulette");
        do {
            System.out.println("what is the number of players?");
            numberPlayers = scanner.nextInt();
            if (numberPlayers > 6) {
                System.out.println("Number of players exceeded, but game will start with 6 players");
                numberPlayers = 6;
            } else if (numberPlayers < 0) {
                System.out.println("woops!!!, you must enter a value more than 0");
            }
        } while (numberPlayers < 0 && numberPlayers > 7);
        System.out.println("Game starts with " + numberPlayers + " player(s)");

        do {
            player = new Player(playerAdd, "Player " + playerAdd, true);
            players.add(player);
            playerAdd++;
        } while (playerAdd <= numberPlayers);

        game = new Game(players, new Revolver());
        game.round();
        System.out.println("\n\nUnfortunately the game is over");
    }
    
}
