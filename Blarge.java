public class Blarge {
    public static void main(String [] args){
    Blarg a = new Blarg(); 
    Blarg b = new Blarg();
    
    a.increment();
    b.increment();
    System.out.println(a.getTing());
    System.out.println(b.getTing());
    System.out.println(Blarg.getTing()); //here we a referring to the whole class
    //static methods of Blarg can be called without a specific Blarg object
    
    
    //if one blarg increments ting, every other blarg has been incremented
    //static variables are the same for all members of the clas
    //Math.random is a static METHOD because we can use it without making a math object
    
    //matrix project will use static methods
    
    }
}