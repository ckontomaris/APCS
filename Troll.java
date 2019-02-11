public class Troll{
    double myMoney;
    static double ourMoney;
    
    public void collect(double toll) {
        myMoney += toll;
        ourMoney += toll; 
    }
    
    public double myMoney (){
        return myMoney; 
    }
    
    public static double treasury(){
        return ourMoney; 
    }
    
    public static void emptyTreasury(){
        ourMoney = 0; 
    }
}