import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

public class TCMMatrizes {
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
      
    
     String Matrix = Matrix(Matrix);
     Recorded1(Matrix);

   


     reader.close();

    

     }

     public static String Matrix(int[][] Matrix)
     {
    
         String text =" ";
         for(int i = 0; i < Matrix.length; i++ )
         {
             for(int j = 0; j< Matrix.length; j++)
             {
                 text += Matrix[i][j] + " ";
             }
            
             text +="\n";
         }

         return text;
     }

 
         public static void Recorded1(String text)
         {
         System.out.println(text);
        
         try
         {
             FileWriter Archive = new FileWriter("Matrix.txt");
             BufferedWriter Writer = new BufferedWriter(Archive);
             Writer.append(text);
             Writer.close();
             Archive.close();
         }
         catch(IOException ex)
         {
             System.err.println(ex.getMessage());
         }
         }



}
