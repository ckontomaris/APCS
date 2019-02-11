public class TrollTester {
    public static void main(String [] args){
        Troll Khanna = new Troll(); 
        Troll Jain = new Troll();
        
        Khanna.collect(5.02); 
        Jain.collect(0.54);
        System.out.println(Khanna.myMoney());        
        System.out.println(Troll.treasury());
        
        Troll.emptyTreasury();
        System.out.println(Troll.treasury());

    }
}