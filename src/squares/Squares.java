/*
 * @HenryHuang
 * squares.java
 * May 9, 2018
 * This program is uses to the squares of the numbers.
 */


package squares;
import java.util.* ; 
/**
 *
 * @author shhua8751
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> squares = new ArrayList();
       // Creating a array list.
       
       System.out.println("Squares ArrayLists \n***********************");
       // Out print the label of the array list
       
       for (int i = 0; i < 10; i++ )
       {
           // Squaring the index value and storing the element
           squares.add(i, i * i);
       }
       
       for (int i =0; i < 10; i ++)
       {
           // Out print the numbers in the array list and the squares of it.
           System.out.println ("Numbers: "  + i + "  Squares: " + squares.get(i));
       }
    }
    
}
