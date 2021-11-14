package HW2.task4;

public class MyFileProcessor {
    static String text = "";  
    public MyFileProcessor(){}
    public static void main(String[] args) {
        ReadProcessor read = new ReadProcessor();
        WriteProcessor write = new WriteProcessor();
        try{
            read.execute();
            write.execute();
        } catch(MyIllegalStateException ex) {
            System.out.println("Some exception.");
        }
    }
    public void execute() throws MyIllegalStateException{
        throw new MyIllegalStateException("This is my illegal exception.");
    }
}