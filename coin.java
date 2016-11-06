

import java.util.Random;

public class coin
 {
  public static void main(String[] args)
   {
    int[] coins = {1, 3, 5, 10, 20, 50, 100, 200, 500};

    int amount = new Random().nextInt(10000);
    int coinsCount = 0;
    System.out.println("amount = " + amount);
    int[] numberOfCoins = findNumberOfCoins(coins, amount);
    for (int i = 0; i < numberOfCoins.length; i++)
     {
      if (numberOfCoins[i] > 0)
       {
        System.out.println("coins= " + coins[i] + " Count=" + numberOfCoins[i] + "\n");
        coinsCount += numberOfCoins[i];
       }

     }
    System.out.println("numberOfCoins = " + coinsCount);
   }

  private static int[] findNumberOfCoins(int[] coins, int amount)
   {
    int c = coins.length;
    int[] numberOfCoins = new int[coins.length];
    while (amount > 0)
     {
      c--;
      if (amount >= coins[c])
       {
        int quotient = amount / coins[c];
        amount = amount - coins[c] * quotient;
        numberOfCoins[c] = quotient;
       }

     }
    return numberOfCoins;
   }
 }