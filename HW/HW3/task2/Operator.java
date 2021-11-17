package HW.HW3.task2;

import java.util.Scanner;

public abstract class Operator {
    static int initialValue;
    public Operator(){};

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        initialValue = scan.nextInt();
        scan.close();
        Add a = new Add();
        Substract s = new Substract();
        Multiply m = new Multiply();
        Divide d = new Divide();
        Clear c = new Clear();

        m.execute(5);
        System.out.println(initialValue);
        a.execute(5);
        System.out.println(initialValue);
        d.execute(5);
        System.out.println(initialValue);
        s.execute(5);
        System.out.println(initialValue);
        c.execute(5);
        System.out.println(initialValue);
        d.execute(0);
    }
    
    public abstract void execute(int anotherValue);
}
