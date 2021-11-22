package HW.HW3.task2;

public class Divide extends Operator{
    public void execute(int anotherValue){
        if(anotherValue == 0) System.out.println("Cannot divide by zero.");
        else initialValue /= anotherValue;
    }
}
