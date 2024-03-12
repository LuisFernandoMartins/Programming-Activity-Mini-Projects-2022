import java.util.Scanner;
import java.security.SecureRandom;


2.770 / 5.000
Resultados de tradução
Resultado da tradução
public class TCMMatrizes4
{
     public static void main(String[] args) throws Exception
     {
         System.out.println(" Luís Fernando da Costa Matins ");
         System.out.println("-----------------------------------");
         System.out.println(" Matrices ");
         System.out.println("-----------------------------------");
 
         Scanner reader = new Scanner(System.in);
        
         System.out.println("How many rows do you want in the Matrix?");
         int Line = reader.nextInt();

         System.out.println("How many columns do you want in the Matrix?");
         int Column = reader.nextInt();
    
       
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
 
     //------------------------------------------IF THERE IS REPETITION (LINE) -------------------------------------------------- ----------------
    
     for (int l = 0; l < Line; l++)
     {
         for (int c = 0 ; c < Column; c++)
         {
             boolean temRepeticao = false;
             for (int k = c + 1; k < Column; k++)
             {
                 if (Matrix[l][k] == Matrix[l][c])
                 {
                     System.out.println("There are Duplicate Elements in the LINE " + l + " in this Array");
                     temRepeticao = true;
                     break;
                 }
             }
            
             if (temRepeticao) { break; }
        
         }
     }
    

     //------------------------------------------IF THERE IS REPETITION (COLUMN) -------------------------------------------------- ----------------
     //
     for (int i = 0; i < Matrix[0].length; i++)
     {
         for (int j = 0 ; j < Matrix.length; j++)
         {
             boolean temRepeticao = false;
             for (int k = j + 1; k < Matrix.length; k++) //Correction
             {
                 if (Matrix[k][i] == Matrix[j][i]) //Correction
                 {
                     System.out.println("There are Duplicate Elements in COLUMN " + i + " in this Array");
                     temRepeticao = true;
                     break;
                 }
             }
        
             if (temRepeticao) { break; }

         }
     }
   
    
      reader.close();
 
     }
}