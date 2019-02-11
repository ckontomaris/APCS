

public class CustomClass {
    int x = 6;

    public void SomeMethod() throws CustomException{ //we made custom exception
        if (x<10){
            throw new CustomException("X is <10"); //triggering an exception is throwing
        } else {
            System.out.println("Good");
        }
    }
}
