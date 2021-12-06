public class InvalidMapException extends Exception{
    public InvalidMapException(int status) {
        if(status == 1) System.out.println("Map size can not be zero");
        else if(status == 2) System.out.println("Not enough map elements");
    }
}