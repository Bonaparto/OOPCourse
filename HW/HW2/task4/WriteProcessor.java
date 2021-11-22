package HW2.task4;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteProcessor extends MyFileProcessor{
    public void execute() throws MyIllegalStateException{
        try {
            if(text == "") super.execute();
            PrintWriter writer = new PrintWriter("output.txt");
            writer.write(text);
            writer.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found.");
        }
    }
}