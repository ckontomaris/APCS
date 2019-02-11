

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions { //you can put throws Exception in the main
    public static void main(String [] args){
        try { //use this to catch exceptions
            Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));

            while(scan.hasNext()){
                try {
                    int i = scan.nextInt();
                    System.out.println(i);

                } catch (InputMismatchException rip){
                    System.out.println("does it scan?");
                    scan.next(); //so it doesnt get stuff scanning the word, we can forcefully advace ti
                }
            }

            System.out.println(5 / 0); //throws exception
        } catch (FileNotFoundException e){ //put name of exception object in here
            System.out.println("File not Found! " + e.getMessage());

        }



        CustomClass a = new CustomClass();

        try{
            a.SomeMethod(); //if the exception happens without a throws or try statement itll crash
        } catch (CustomException rip){
            System.out.println("nope: " + rip.getMessage());
        }


    }
}
