import java.util.Scanner; 
 
    
   public class atv4 {
         public static void main(String[] args) {
             System.out.println(" Luís Fernando da Costa Matins ");
             System.out.println("-----------------------------------");
             System.out.println(" ATV 4 ");
             System.out.println("-----------------------------------");

             //Data input

             Scanner reader = new Scanner(System.in);

             System.out.println("Enter the distance in KM");
             double n1 = reader.nextDouble();

             System.out.println("Enter the time in minutes");
             double n2 = reader.nextDouble();

             double formula = n1 / (n2 / 60);
             double formula2 = (n1 / (n2 / 60)) * 3.6;

             System.out.println( " The distance in KM was " + n1 + " the time in Minutes was " + n2);
             System.out.println( " the speed in KM/h was " + formula + " and the value in m/s was "+ formula2);
            
         }
      
     }