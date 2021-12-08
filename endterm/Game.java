import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Game {
    private Map map;
    private Player player;
    private String turns;
    public static void main(String[] args) {
        Scanner scan = null;
        Map m = null;

        try{
            File file = new File("input.txt");
            scan = new Scanner(file);
            m = new Map(scan);
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found.");
        } catch(InvalidMapException ex1) {
            System.exit(1);
        }

        Player p = new MyPlayer();
        Game g = new Game(m);
        
        g.addPlayer(p);
        
        g.turns = scan.nextLine();
        for(int i = 0; i < g.turns.length(); ++i) {
            if(g.turns.charAt(i) == 'R') p.moveRight();
            if(g.turns.charAt(i) == 'L') p.moveLeft();
            if(g.turns.charAt(i) == 'U') p.moveUp();
            if(g.turns.charAt(i) == 'D') p.moveDown();
        }

        Position playerPosition = p.getPosition();
        System.out.println("Player final position");
        System.out.println("Row: " + playerPosition.getY());
        System.out.println("Col: " + playerPosition.getX());
    }

    public Game(Map m) {
        this.map = m;
    }

    public void setMap(Map m) {
        player.setMap(m);
    }

    public void addPlayer(Player p) {
        p.setMap(map);
    }
}