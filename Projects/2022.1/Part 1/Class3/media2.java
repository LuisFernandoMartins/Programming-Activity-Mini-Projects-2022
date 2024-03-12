import java.util.Scanner;
import javax.print.attribute.SupportedValuesAttribute;
import org.w3c.dom.Notation;

public class media2
{
     public static void main(String[] args) {
     System.out.println("Luís Fernando da Costa Martins");
     System.out.println("--------------------------------");
     System.out.println("Calculator in Java 2");
     System.out.println("--------------------------------");

     Scanner reader = new Scanner(System.in);
     String name1 = "Luis Matins";

     System.out.println("Enter price: ");
     String n1Str = reader.nextLine();
     double n1 = Double.parseDouble(n1Str);
    

     System.out.println("Increase percentage:");
     String n2Str = reader.nextLine();
     double n2 = Double.parseDouble(n2Str);
       
     double average = n1 + (n1 * n2) / 100;

  System.out.println( " The price of Hentão do " + nome1 + " rose from " + n1 + " to " + average);


  reader.close();


  }
    

}