public class problem9
{

   public static int exp(int a, int b)
   {
      int result = 1;
      for(int i = 0; i < b; i++)
      {
         result *= a;
      }
      return result;
   }
   
   public static void main(String[] args)
   {
      int resultA = 0;
      int resultB = 0;
      int resultC = 0;
      for (int a = 1; a < 1000; a++)
      {
         for (int b = 1; b < 1000-a; b++)
         {
            int c = (1000-a)-b;
            /* Diagnostic Outputs
            System.out.print(a);
            System.out.print(", ");
            System.out.print(b);
            System.out.print(", ");
            System.out.print(c);
            System.out.print(", ");
            System.out.println(a+b+c);
            */
            if ((a*a) + (b*b) == (c*c))
            {
               resultA = a;
               resultB = b;
               resultC = c;
            }
         }
         /*
         if (a%10 == 0)
         {
            System.out.println(a);
         }
         */
      }
      System.out.println(resultA);
      System.out.println(resultB);
      System.out.println(resultC); 
      System.out.println(resultA * resultB * resultC);
   }
}