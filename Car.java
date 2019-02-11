public class Car
{
    //no public static void main so its an object 
    double speed;
    int numWheels;
    String make;
    String model;
    
    
    public double getSpeed() {return speed;}
    public void setSpeed(double s) {speed=s;}
    public int getWheels() {return numWheels;}
    public void setWheels(int w) {numWheels = w;}
    public String getMake() {return make;}
    public String getModel() {return model;}
    
    
    //constructor, method with same name as class
    public Car() {
       //setting default values
       speed = 0; numWheels = 4; make = "Generic"; model = "Car";
    }
    
    //constructor with parameters
    public Car(double s, int w, String m, String d){
        speed = s; numWheels=w; make=m; model = d; 
    }
    
    //methods are operations that can "happen" to the object
    public void accelerate(double a){
        if (numWheels> 0){
            speed = speed + a;
        }
    }
    
    public void crash(){
        if (speed>40 && numWheels > 0){
            numWheels--;
        }
        speed = 0 ;
    }
    
    public String honk() { 
     return "Generic Honk"; //noise of car honking   
    }
}