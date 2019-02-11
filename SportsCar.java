public class SportsCar extends Car{
    
    public SportsCar(){
        super();   
    }
    public SportsCar(double s, int w, String m, String d){
        super(s,w,m,d);
    }
    
    
    public String honk(){
        return "meep meep";
    }
}