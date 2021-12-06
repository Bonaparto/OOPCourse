package BonusHW;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);
            HashMap<String, Integer> m = new HashMap<>();
            PrintWriter writer = new PrintWriter("output.txt");
            while(scan.hasNextLine()) {
                Scanner scan1 = new Scanner(scan.nextLine());
                while(scan1.hasNext()) {
                    String s = scan1.next();
                    if(m.containsKey(s)) {
                        m.put(s, m.get(s) + 1);
                    } else {
                        m.put(s, 1);
                    }
                }
            }
            scan.close();
            for(Map.Entry entry: m.entrySet()) {
                System.out.println(entry);
            }
            writer.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found.");
        }
    }   
}