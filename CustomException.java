

public class CustomException extends Exception { //we can make our OWN exception
    /**
     * Our own exception made by subclassing Java's exception class
     */
    public CustomException() { super(); }
    //exceptions usually have 2 constructors
    public CustomException(String s) {super(s);}
}
