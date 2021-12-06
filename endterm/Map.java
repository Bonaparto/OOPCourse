import java.util.Scanner;

public class Map {
    
    int X;
    int Y;
    int size;
    char map[][];

    public Map(Scanner scan) throws InvalidMapException{
        try{
            size = scan.nextInt();
            map = new char[size][size];

            if(size == 0) throw new InvalidMapException(1);           
            scan.nextLine();

            for(int i = 0; i < size; ++i) {

                String s = null;
                if(scan.hasNextLine()) s = scan.nextLine();
                else throw new InvalidMapException(2);
                
                for(int j = 0; j < s.length(); j += 2) {
                    char c = s.charAt(j);
                    map[i][j / 2] = c;
                    if(c == 'P') {
                        Y = i;
                        X = j / 2;
                    }
                }
            }
        } catch(InvalidMapException ex) {
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
