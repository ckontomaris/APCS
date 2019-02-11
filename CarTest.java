public class CarTest{
    public static void main(String [] args){
        Car FirstCar = new Car();
        Car SecondCar = new Car(50, 8, "Caterpillar", "Dozer");
        
        SecondCar.crash();
        System.out.println(SecondCar.getWheels());
        System.out.println(SecondCar.getSpeed());
        
        //now the truck has inherited all the methods of the car, except constructors
        Truck MahTruck = new Truck();
        MahTruck.accelerate(50);
        MahTruck.setWheels(5);
        
        
        //Polymorphism: SuperClass variable can hold subclass object
        //car variable holds truck object
        Car SomeCar = new Truck(5.0, 8, "Dodge", "Smashface");
        //we can't use this cuz java thinks its just a car SomeCar.tow(new car());
        //polymorphism does not allows subclass calls 
        
        //it WILL call overridden versions of methods
        System.out.println(SomeCar.honk());
        
        
        Car[] Garage = new Car[5];
        
        for(int i=0; i<5; i++){
            if(Math.random() > 0.5){
                Garage[i] = new Truck();
            } else {
                Garage[i] = new SportsCar();
            }
        }
        
        
        //for each loop
        //in each iteration, c is the next Car in the Garage array, arraylist or Collections
        for (Car c : Garage){ 
            System.out.println(c.honk());
        }
        //so you could go through each "enemy" and run its own move or attack method
    }
}