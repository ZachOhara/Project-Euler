public class actually_problem_two {

public static int[] pushToList(int[] array, int toBePushed) //simulates the array.push(int) function because I couldn't figure out how to set that up
{
   int[] newArray = new int[array.length + 1];
   for(int i = 0; i < array.length; i++) {
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
   System.out.print("]");
   return;
}

public static void main( String[] args){

int[] fibsList = new int[2];
fibsList[0] = 1;
fibsList[1] = 2;

while(fibsList[fibsList.length-1] <= 4000000)
{
   fibsList = pushToList(fibsList, fibsList[fibsList.length - 1] + fibsList[fibsList.length - 2]);
}

printArray(fibsList);
System.out.println();
int sum = 0;

for(int i = 0; i < fibsList.length; i++)
{
   if (fibsList[i] % 2 == 0)
   {
      sum = sum + fibsList[i];
   }
}

System.out.print(sum);

}
}