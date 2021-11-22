package HW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile2 {
    
    public static void main(String[] args) {
        boolean f = true, f1 = true;
        try {
            File file = new File("input1.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
            f1 = false;
        } catch(FileNotFoundException ex) {
            f = false;
            try {
                File file1 = new File("input2.txt");
                Scanner scan1 = new Scanner(file1);
                while(scan1.hasNextLine()) {
                    String line = scan1.nextLine();
                    System.out.println(line);
                }
                scan1.close();
                f1 = true;
            } catch(FileNotFoundException ex1) {
                f1 = false;
            }
        }
        finally { 
            if(f) {
                System.out.println("First file was found.");
            } else if(f1) {
                System.out.println("Second file was found.");
            } else {
                System.out.println("Files were not found.");
            }
        }
    }
}