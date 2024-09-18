package AdvancePattern;
import java.util.*;


public class SolidRhombus {
    public static void main(String[] args){
        System.out.println("2.Solid Rhombus:");
        System.out.println();
        //Printing solid rhombus
        int m = 5;

        for(int i=1; i<=m; i++) {

            // spaces
            for(int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
 
            // stars
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }    
}
