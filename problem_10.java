public class problem_10
{
   public static void print(int[] array)
   {
      System.out.print("[");
      for(int i = 0; i < array.length - 1; i++)
      {
         System.out.print(array[i]);
         if (i != array.length-1)
         {
            System.out.print(", ");
         }
      }
      System.out.println("]");
   }
   
   public static void print(boolean[] array)
   {
      System.out.print("[");
      for(int i = 0; i < array.length - 1; i++)
      {
         if (array[i])
         {
            System.out.print("T");
         } 
         else
         {
            System.out.print("F");
         }
         if (i != array.length-1)
         {
            System.out.print(", ");
         }
      }
      System.out.println("]");
   }
   
   public static int evalPrimes(boolean[] primeList)
   {
      int sum = 0;
      for(int i = 1; i <= primeList.length; i++)
      {
         if (primeList[i-1])
         {
            sum += i;
         }
      }
      return sum;
   }
   
   public static void main(String[] args)
   {
      long sum =0;
      for(int i = 3; i<2000000;i+=2)
      {
         if(isPrime(i))
         {
            sum+=i;
         }
      }
      System.out.println(sum + 2);
   }

   public static boolean isPrime(int n)
   {
      boolean prime = true;
      if (n<2) 
         return false;
      if (n==2) 
         return true;
      if (n%2==0) 
         return false;
      for (int i = 3; i<=Math.sqrt(n);i+=2)
      {
         if (n%i==0)
         {
            prime=false;
            break;
         }
      }
      return prime;
   }
   
   public static void unmain(String[] args)
   { 
      int N = 2000000;
   
        // initially assume all integers are prime
      boolean[] isPrime = new boolean[N + 1];
      for (int i = 2; i <= N; i++) {
         isPrime[i] = true;
      }
   
        // mark non-primes <= N using Sieve of Eratosthenes
      for (int i = 2; i*i <= N; i++) {
      
            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
         if (isPrime[i]) {
            for (int j = i; i*j <= N; j++) {
               isPrime[i*j] = false;
            }
         }
      }
   
        // count primes
      int primes = 0;
      for (int i = 2; i <= N; i++) {
         if (isPrime[i]) primes++;
      }
      System.out.println("The number of primes <= " + N + " is " + primes);
        //print(isPrime);
      System.out.println(evalPrimes(isPrime));
   }
}