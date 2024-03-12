import java.util.Scanner;
public class class5 {
    public static void main(String[] args) throws Exception {
         System.out.println(" Luís Fernando da Costa Matins ");
         System.out.println("-----------------------------------");
         System.out.println(" If and Else ");
         System.out.println("-----------------------------------");
 
         Scanner reader = new Scanner(System.in);
        
         System.out.println("Note 1: ");
         double n1 = reader.nextDouble();

         System.out.println("Note 2: ");
         double n2 = reader.nextDouble();

         double average = (n1 + n2) / 2;
        
         System.out.println("Your Average is "+ average );
       
         if (average >= 7) { //True
             System.out.println("You are approved");
         }
        
         if (average < 7) { // false
             System.out.println("You have failed");
         }
        
         reader.close();
    
     }
}



