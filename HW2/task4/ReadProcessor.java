package HW2.task4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadProcessor extends MyFileProcessor{
    public void execute() throws MyIllegalStateException{
        try {
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                text += scan.nextLine() + "\n";
            }
            scan.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found.");
        }
    }
}