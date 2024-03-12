import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public class TCMMatrizes2
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
    
         System.out.println("How many rows do you want in Matrix 2?");
         int Line2 = reader.nextInt();

         System.out.println("How many columns do you want in Matrix 2?");
         int Column2 = reader.nextInt();

         int[][] Matrix = new int[Row][Column];
         int[][] Matrix2 = new int[Row2][Column2];

        


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
      //------------------------------------------CREATION OF MATRIX 2-- -------------------------------------------------- -----------

      for( int l = 0; l < Line2; l++)
      {
          for(int c = 0; c < Column2; c++)
          {
              Matrix2[l][c] = new SecureRandom().nextInt(9 + 9) - 9;
          }
      }
          
      for( int l = 0; l < Line2; l++)
      {
          for(int c = 0; c < Column2; c++)
          {
              System.out.printf("[ %d ]",Matrix2[l][c]);
          }
          System.out.printf("%n");
      }
    
      System.out.println();
     
     
      //------------------------------------------CHECK IF THERE IS A REPEAT IN THE HOUSE -----------------------------------------------
     
     
     
      boolean Equals = true;

      for(int l = 0; l < Line; l++)
      {
          for(int c = 0; c < Column; c++)
          {
              for(int l2 = 0; l2 < Line2; l2++)
              {
                  for(int c2 = 0; c2 < Column2; c2++)
                  {
                      if (Matrix[l][c] == Matrix[l2][c2])
                      {
                         Equals = false;
                         
                          break;
                      }
                 }
                  if(!Equals)
                  {
                      break;
                  }
     
              }
              if (!Equals)
              {
                  break;
              }
          }
          if (!Equals)
          {
              break;
          }
      }



     
      reader.close();

     }





}