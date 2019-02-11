public class Truck extends Car{
    //extends keyword tells Java that Truck "is-a" car
    //without anymore code, Truck and car are identical
    Car towedCar;
    public Truck() {
        super(); //calls constructor for the superClass (Car)
    }
    
    public Truck(double s, int w, String m, String d){
        super(s,w,m,d); //calls the superClass constructor that took 4 parameters
    }
    
    //methods that the car doesn't have
    public void tow(Car a){
        a.setSpeed(this.speed); //this keyword refers to "this" object
        //in this case, this refers to "this" Truck
        //we only need this when there's ambiguity, like if we had a speed variable for just this method
        towedCar= a;
    }
    
    // Override superclass methods, now the Truck returns a different honk
    public String honk (){
        return "BRWAAAAAHH";   
    }
    public void crash(){
        if (towedCar != null) {
            towedCar.crash();
        }
        if(speed > 50 && numWheels >0) {numWheels --;}
    }
}