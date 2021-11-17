package HW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ReadAndWrite {
    
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);
            int line_count = 0, word_count = 0;
            PrintWriter writer = new PrintWriter("output.txt");
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                line_count++;
                String[] splitted = line.split(" ");
                word_count += splitted.length;
            }
            writer.write("Number of lines in file: " + line_count + "\nNumber of word in file: " + word_count);
            scan.close();
            writer.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found.");   
        }
    }
}