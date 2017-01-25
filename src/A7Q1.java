
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         //asking the user how many students are in the class
         System.out.println("How many students are in the class");
         int student = input.nextInt();
         double[] marks = new double[student];
         //asking user for marks 
         for(int i = 0; i< marks.length;i++){
            System.out.println("Please enter in mark" + (i+1));
            marks[i]= input.nextDouble();
            }
            //adding the marks together
             double total = 0;
         for(int i=0 ;i<marks.length; i++){
             // add tyhe number into toatal
             total= total + marks[i];
        }
         //giving the user the average
         double avg = total/ marks.length;
         avg= Math.round(avg*100)/100.0;
         System.out.println("Average: " + avg);
         
    }
}
