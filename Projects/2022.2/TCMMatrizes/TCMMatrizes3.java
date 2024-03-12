import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public class TCMMatrizes3
{
     public static void main(String[] args) throws Exception
     {
         System.out.println(" Luís Fernando da Costa Matins ");
         System.out.println("-----------------------------------");
         System.out.println(" Matrices ");
         System.out.println("-----------------------------------");
 
         Scanner reader = new Scanner(System.in);
        
         System.out.println("How many rows do you want in Matrix 1?");
         int Line = reader.nextInt();

         System.out.println("How many columns do you want in Matrix 1?");
         int Column = reader.nextInt();
    
         int count = 0;
         int[][] Matrix = new int[Row][Column];
      

        


      //------------------------------------------MATRIX CREATION--- -------------------------------------------------- -----------

      for( int l = 0; l < Line; l++)
      {
          for(int c = 0; c < Column; c++)
          {
              Matrix[l][c] = new SecureRandom().nextInt(9 + 9) - 9;
          }
      }
          
      for( int l = 0; l < Line; l++)
      {
          for(int c = 0; c < Column; c++)
          {
              System.out.printf("[ %d ]",Matrix[l][c]);
          }
          System.out.printf("%n");
      }

      System.out.println();

     //------------------------------------------VERIFICATION----- -------------------------------------------------- ---------

     
      for (int l = 0; l < Line; ++l)
      {
         for (int c = 0; c < Column; ++c)
         {
             if (Array[l][c] == 0)
             {
                 ++counter;
             }
         }
      }
        
      if (counter > ((Row * Column) / 2))
      {
         System.out.println("Yes, This Matrix is Sparse");
      }
     
      else
      {
         System.out.println("No, This Matrix is not Sparse");
      }
    

     

      reader.close();
     }
}