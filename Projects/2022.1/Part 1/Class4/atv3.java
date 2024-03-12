import java.util.Scanner; 
import java.lang.Math;


1.092 / 5.000
Resultados de tradução
Resultado da tradução
public class atv3 {
     public static void main(String[] args) {
         System.out.println(" Luís Fernando da Costa Matins ");
         System.out.println("-----------------------------------");
         System.out.println(" CLASS 4 - Correction ");
         System.out.println("-----------------------------------");

         Scanner reader = new Scanner(System.in);
         double value = reader.nextDouble();



         int grade100 =(int)value / 100;
         int rest = (int)value % 100;

         int grade50 =(int) rest / 50;
         rest = (int) rest % 50;

         int grade10 =(int) rest / 10;
         rest = (int) rest % 10;

         int grade5 =(int) rest / 5;
         rest = (int) rest % 5;

         int grade1 = rest;


         System.out.println("Number of notes: " + note100 );
         System.out.println("Amount of notes: " + note50 );
         System.out.println("Number of notes: " + note10 );
         System.out.println("Number of notes: " + note5 );
         System.out.println("Number of notes: " + note1 );

     }

}

