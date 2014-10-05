public class problem4
{

   public static int[] pushToList(int[] array, int toBePushed)
   {
      int[] newArray = new int[array.length + 1];
      for(int i = 0; i < array.length; i++)
      {
         newArray[i] = array[i];
      }
      
      newArray[newArray.length - 1] = toBePushed;
      return newArray;
   }
   
   public static void printArray(int[] array) {
      System.out.println("");
      System.out.print("[");
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i]);
         if (i + 1 < array.length) {
            System.out.print(", ");
         }
      }
      System.out.println("]");
      return;
   }

   public static boolean isPalindrome(int number)
   {
      int[] numberList = new int[0];
      int origNumber = number;
      int reps = Integer.toString(number).length();
      for(int i = 0; i < reps; i++)
      {
         float decimal = (float)number / 10;
         number = number/10;
         int test = (int)((10*decimal) - (10*number));
         
         /*System.out.println(decimal);
         System.out.println((float)number);
         System.out.println(decimal - number);
         System.out.println(10 * (decimal - number));
         System.out.println(test);*/
         
         numberList = pushToList(numberList, test);
         
         /*System.out.println(decimal);
         System.out.println(number);
         System.out.println(test);
         printArray(numberList);
         System.out.println();*/
      }
      
      int reversedNumber = 0;
      
      int i2 = numberList.length - 1;
      
      //printArray(numberList);
      
      for(int i = 0; i <= numberList.length - 1; i++)
      {
         reversedNumber = reversedNumber + ( numberList[i2] * (int)Math.pow(10,i) );
         
         /*System.out.println(reversedNumber);
         System.out.println(i);
         System.out.println(i2);
         System.out.println(); */
         i2--;
      }
      
      /*System.out.println(origNumber);
      System.out.println(reversedNumber);*/
      
      return origNumber == reversedNumber;
   }

   public static void main(String[] args)
   {
      boolean bool = isPalindrome(998001);
      System.out.println(bool);
      System.out.println();
      System.out.println();
      
      int max = 0;
      
      for(int a = 100; a <= 999; a++)
      {
         for(int b = 100; b <= 999; b++)
         {
            if (isPalindrome(a*b))
            {
               System.out.println(a);
               System.out.println(b);
               System.out.println(a*b);
               if (a*b > max)
               {
                  max = a*b;
               }
            }
         }
      }
      System.out.println(max);
      
   }

}