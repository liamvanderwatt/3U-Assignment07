
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are in your group");
        int group = input.nextInt();
        double[] height = new double[group];
        double total = 0;
        for (int i = 0; i < height.length; i++) {
            // add tyhe number into toatal
            System.out.println("Please enter the height of person " + (i + 1));
            height[i] = input.nextDouble();
            total = total + height[i];
            } 
         double avg = total / height.length;
         System.out.println("the average height is "+ avg);
        for (int i = 0; i < height.length; i++) {
            double above = height[i] - avg;
            if (above > 0) {
                System.out.println("These heights are above the average "+height[i]);
            }

        }
    }
}
