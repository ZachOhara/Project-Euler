public class problem6
{

   public static void main(String[] args)
   {
   
      int sumOfSquares = 0;
      int squareOfSums = 0;
   
      for(int i = 0; i <= 100; i++)
      {
         sumOfSquares = sumOfSquares + (int)Math.pow(i,2);
         squareOfSums = squareOfSums + i;
      }
      
      System.out.println(sumOfSquares);
      System.out.println(squareOfSums);
      System.out.println(Math.pow(squareOfSums,2) - sumOfSquares);
      
      
   }

}