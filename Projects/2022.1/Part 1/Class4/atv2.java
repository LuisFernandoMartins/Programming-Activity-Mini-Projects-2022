import java.util.Scanner; 
import java.lang.Math;
    
public class atv2 {
         public static void main(String[] args) {
             System.out.println(" Luís Fernando da Costa Matins ");
             System.out.println("-----------------------------------");
             System.out.println(" CLASS 4 - Correction ");
             System.out.println("-----------------------------------");

             Scanner reader = new Scanner(System.in);
             System.out.println("Enter the initial value:");
             double n1 = reader.nextDouble();

             System.out.println("Enter the interest amount in Percentage:");
             double n2 = reader.nextDouble();
            
             System.out.println("Enter the time in months");
             double n3 = reader.nextDouble();

             double formula = n1 + (1 + (n2 / 100));
             double power = Math.pow(formula, n3);
            
             System.out.println("the Final Value will be "+ formula);

            
             reader.close();

       
       
       
         }
     }