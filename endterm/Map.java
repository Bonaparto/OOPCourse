import java.util.Scanner;

public class Map {
    
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

