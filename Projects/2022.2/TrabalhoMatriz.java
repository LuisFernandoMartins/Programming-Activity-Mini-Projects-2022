public class WorkMatrix
{
    public static void main(String[] args) throws Exception
    {
 

System.out.println(" Luís Fernando da Costa Matins ");
         System.out.println("-----------------------------------");
         System.out.println(" Matrices ");
         System.out.println("-----------------------------------");
 
         Scanner reader = new Scanner(System.in);
        
         System.out.println("How many lines do you want?");
         int Line = reader.nextInt();

         System.out.println("How many columns do you want?");
         int Column = reader.nextInt();

         System.out.println("What Number Do You Want to Multiply Your Matrix By? ");
         int mult = reader.nextInt();

         int m[][]=new int[Row][Column];

         int[][] Matrix = new int[Row][Column];

       
        
        
         int Sum = 0;
         int Sum3 = 0;
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

         for( int l = 0; l < Line; l++)
         {
            
             for(int c = 0; c < Column; c++)
             {
                Sum = Sum + Matrix[l][c];
              
               
             }
             System.out.println();
             System.out.printf("The sum of Line [%d] is: %d ",l+1, Sum);

             Sum = 0;
         }

         for (int c = 0; c < Column; c++)
         {
             for (int l = 0; l < Line; l++)
             {
                 Sum3 = Sum3 + Matrix[l][c];
             }
               
             System.out.println();
             System.out.printf("The sum of Column [%d] is: %d ",c+1, Sum3);
            
            

             Sum3 = 0;
         }
     System.out.println();

     //-------------------------------------------TRANSPOSED MATRIX--- -------------------------------------------------- ----------

     for(int c = 0; c < Column; c++ )
     {
         for( int l = 0; l < Line; l++)
         {
            
             System.out.printf("[ %d ]",Matrix[l][c]);
         }
         System.out.printf("%n");
     
     }
System.out.println();

     //-------------------------------------------OPPOSITE MATRIX--- -------------------------------------------------- --------------

     for(int l = 0; l < Line; l++ )
     {
         for(int c = 0; c < Column; c++)
         {
            
             System.out.printf("[ %d ]",-1*(Array[l][c]));
         }
         System.out.printf("%n");
     }

     System.out.println();
     //-------------------------------------------MATRIX MULTIPLIED BY VALUE- --------------------------------------------------

     for(int l = 0; l < Line; l++ )
     {
         for(int c = 0; c < Column; c++)
         {
            
             System.out.printf("[ %d ]",mult*(Matrix[l][c]));
         }
         System.out.printf("%n");
     }
     System.out.println();
     //-------------------------------------------SUM MATRIX--- -------------------------------------------------- ----------------

     for(int l = 0; l < Line; l++ )
     {
         for(int c = 0; c < Column; c++)
         {
            
             System.out.printf("[ %d ]",(Matrix[l][c])+(Matrix[l][c]));
         }
         System.out.printf("%n");
     }
     System.out.println();

     //-------------------------------------------MATRIX SUBTRACTION--- -------------------------------------------------- -----------

     for(int l = 0; l < Line; l++ )
     {
         for(int c = 0; c < Column; c++)
         {
            
             System.out.printf("[ %d ]",(Matrix[l][c])-(Matrix[l][c]));
         }
         System.out.printf("%n");
     }
     System.out.println();

     //------------------------------------------MULTIPLICATION MATRIX (TO BE FIXED ) ------------------------------------------------- ---------------

     for(int l = 0; l < Line; l++ )
     {
         for(int c = 0; c < Column; c++)
         {
             m[l][c]=0;
            
             for(int k = 0 ; k < Row;k++)
             {
            
                 System.out.printf("[ %d ]",( m[l][c]+=Matrix[c][k]*Matrix[k][l]));
            
             }
         System.out.printf("%n");
     }
     System.out.println();
}
       reader.close();
 


     }

    

}
