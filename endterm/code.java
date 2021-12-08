/* 
Enter your code here. 
Create all the necessary classes and methods as per the requirements. 
*/
// START of your code
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Position {
    
    protected int X;
    protected int Y;

    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }
    
    public int getY() {
        return Y;
    }

    public boolean equals(Position p) {
        return p.X == this.X && p.Y == this.Y;
    }

    public String toString() {
        return "(" + X + "," + Y + ")";
    }

}

interface Player {
    public void setMap(Map map);
    public void moveRight();
    public void moveLeft();
    public void moveDown();
    public void moveUp();
    public Position getPosition();
}

class MyPlayer implements Player {
    
    Map map;
    Position pos;

    public MyPlayer(){};

    public void setMap(Map map) {
        this.map = map;
        this.pos = new Position(map.X, map.Y);
    }

    public void moveRight() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(X + 1 < size && map.getValueAt(X + 1, Y) != '1') pos.setX(X + 1);;
    }

    public void moveLeft() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(X > 0){
            if( map.getValueAt(X - 1, Y) != '1')
            pos.setX(X - 1);
        } 
    }

    public void moveUp() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(Y > 0){
            if(map.getValueAt(X, Y - 1) != '1')
            pos.setY(--Y);
        }
    }

    public void moveDown() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(Y + 1 < size && map.getValueAt(X, Y + 1) != '1') pos.setY(++Y);
    }

    public Position getPosition() {
        return this.pos;
    }
}

class Map {
    
    protected int X;
    protected int Y;
    private int size;
    private char map[][];

    public Map(Scanner scan) throws InvalidMapException{
        try{
            size = scan.nextInt();
            map = new char[size][size];

            if(size == 0) throw new InvalidMapException("Map size cannot be zero");           
            scan.nextLine();

            for(int i = 0; i < size; ++i) {

                String s = null;
                if(scan.hasNextLine()) s = scan.nextLine();
                else throw new InvalidMapException("Not enough map elements");

                // if(i == size - 1 && !scan.hasNextLine())  throw new InvalidMapException("Not enough map elements");
                
                for(int j = 0; j < s.length(); j += 2) {
                    char c = s.charAt(j);
                    map[i][j / 2] = c;
                    if(c == 'P') {
                        X = j / 2;
                        Y = i;
                    }
                }
            }
        } catch(InvalidMapException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public int getSize() {
        return size;
    }

    public char getValueAt(int X, int Y) {
        return map[Y][X];
    }

    public void print() {
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Game {
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

        Position pos = p.getPosition();
        System.out.println("Player final position");
        System.out.println("Row: " + pos.getY());
        System.out.println("Col: " + pos.getX());
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

class InvalidMapException extends Exception{
    public InvalidMapException(String message) {
        super(message);
    }
}

// END of your code.

/*
DO NOT MODIFY THIS PART!!!
Input and Output has been done for you.
Various conditions are meant to check individual classes separately.
You still need to implement completely all the necessary classes with their corresponding methods,
but the correctness for each class is checked individually.
In other words, you already get some partial points for implementing some classes completely and correctly, 
even if other classes are complete but still may not work properly.
*/
public class Solution{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className = input.nextLine();
        
        // Checking the implementation of the Position class
        if(className.equals("Position")){
            Position p1 = new Position(input.nextInt(), input.nextInt());
            System.out.println(p1);
            p1.setX(5);
            System.out.println(p1.getX());
            
            Position p2 = new Position(5, 10);
            System.out.println(p1.equals(p2));            
        }
        
        // Checking the implementation of the Map class
        else if(className.equals("Map")){
            try{
                Map map = new Map(input);
                map.print();
                int size = map.getSize();
                System.out.println(size);		
                System.out.println(map.getValueAt(size/2, size/2)); 
            }
            catch(Exception e){}
        }
        
        // Checking the Player interface and the MyPlayer class
        else if(className.equals("Player")){
            Player player = new MyPlayer();
            System.out.println(Player.class.isInterface());  
            System.out.println(player instanceof Player);
            System.out.println(player instanceof MyPlayer);
        }
        
        // Checking the InvalidMapException class
        else if(className.equals("Exception")){
            try{
                throw new InvalidMapException("Some message");
            }
            catch(InvalidMapException e){
                System.out.println(e.getMessage());
            }
        }
        
        // Checking the Game class and all of its components
        else if(className.equals("Game")){
            
            // Initialize player, map, and the game
            Player player = new MyPlayer();
            Game game = null;

            try{
                game = new Game(new Map(input));
            }
            catch(InvalidMapException e){ // custom exception
                System.out.println(e.getMessage());
                System.exit(0);
            }

            game.addPlayer(player);

            // Make the player move based on the commands given in the input
            String moves = input.next();
            char move;
            for(int i=0; i<moves.length(); i++){
                move = moves.charAt(i);
                switch(move){
                    case 'R':
                        player.moveRight();
                        break;
                    case 'L':
                        player.moveLeft();
                        break;
                    case 'U':
                        player.moveUp();
                        break;
                    case 'D':
                        player.moveDown();
                        break;
                }
            }

            // Determine the final position of the player after completing all the moves above
            Position playerPosition = player.getPosition();
            System.out.println("Player final position");
            System.out.println("Row: " + playerPosition.getY());
            System.out.println("Col: " + playerPosition.getX());
        }
	}
}