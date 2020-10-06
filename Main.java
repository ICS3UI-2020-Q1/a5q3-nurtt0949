import java.util.Scanner;
/**
 *tells user their factorial
 * @author Tolga Nurtekin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
     Scanner input = new Scanner(System.in);
    //ask user for number they want the factorial of
     System.out.println("Please enter an integer to calculate the factorial of");
    //declare a variable to store users integer
     int integer = input.nextInt();
    //declare a variable for accumalator
     int total = 1;
    //create a for loop
     for(int count = 1; count <= integer; count++){
    //multiplictation for the total
       total = total * count;
    
     }
     //print the factorial to the screen
     System.out.print(integer + "! " + "= " + total);


    
  }
}

