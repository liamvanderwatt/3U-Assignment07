
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating a scanner for input
        Scanner input = new Scanner(System.in);
        //asking user for numbers
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        //switching the numbers if the frist number is greater
        int[] orders = {num1, num2};
      if (orders[0]>orders[1]){
      int total = orders[0]+orders[1];
       orders[0]= total-orders[0];
       orders[1]=total-orders[1];
          System.out.println("These are your ordered number"+orders[0] +","+orders[1]);
      }
      //this is for when the first number is smaller
       if(orders[0]<orders[1]){
            System.out.println("These are your ordered number"+orders[0] +","+orders[1]);
       }    
      

    }
}
