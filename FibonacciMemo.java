

import java.util.Arrays;

class FibonacciMemo
{
   private static long count = 0; 
   private static long [] memo;  

   public static void main ( String [] args )
   {
      int num = 0;
      try {
         num = Integer.parseInt( args[0] );
         if ( num < 0 )
            throw new IllegalArgumentException( "Must be a positive Integer" );
      } catch ( Exception e ) {
         System.err.println( "Usage: java Fibonacci <num>\n"
            + "\twhere <num> is a positive Integer" );
         System.exit( 1 );
      }


      memo = new long[(num<2) ? 2 : num+1];  
      Arrays.fill( memo, -1 );

      
      memo[0] = 0;
      memo[1] = 1;

      System.out.println ( "fib(" + num + ") = "
         + fib( num ) );
      System.out.println( "\nNumber of calls to method fib: " + count );
   }

   
   private static long fib ( int num )
   {
      ++count;  

      
      if ( memo[num] == -1 )
      
         memo[num] = fib( num-1 ) + fib( num-2 );

      return memo[num];
   }
}
