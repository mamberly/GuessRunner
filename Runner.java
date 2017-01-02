import java.util.Scanner;
import java.util.Random;
/** 
Runner class tests the Person, Computer and User classes
*/
public class Runner
{
public static void main(String[] args)
{
   Random rand = new Random();
   Scanner scan = new Scanner(System.in);
   int guess = 0;
   int userScore = 0;
   int compScore = 0;
   int[] val = new int[3];
   
   //Get name and level from user
   System.out.println("What is your name?");
   String name = scan.nextLine();
   System.out.println("Alright, " + name + " ,easy or hard?");
   String dificult = scan.nextLine();
   
   //Make objects of user and computer based on level
   User user = new User(name, dificult);
   Computer computer = new Computer("computer", dificult);
   
   //start looping through the game. 3 times to guess 3 different numbers
   for(int i = 0; i < 3; i++)
   {
      //new value to guess created
      val[i] = rand.nextInt(1000);
      System.out.println("There's a new number to guess... can you beat the computer?");
      for(int k = 0; k < 2; k++)
      {
         //User must in put a number between 0 and 999 
         do
         {
            System.out.print("What is your guess? (between 0 and 1000)");
            guess = scan.nextInt();
         }
         while(!(guess > 0 && guess < 999));
         //send the guess over     
         user.guess(val[i], guess);
         computer.guess(val[i], guess, k);
         System.out.println("The computer guessed: " + computer.getGuess());
      }
      //print score for that number 
         System.out.println("Your score is: " + user.getScore(computer));
         System.out.println("Computer's score is: " + computer.getScore(user)+"\n");
      compScore +=computer.getScore(user);
      userScore +=user.getScore(computer);
   }
   //determine the winner and print
   if(userScore <= compScore) System.out.println("You win!");
   else
   System.out.println("Computer wins! Try again next time!");
   System.out.println("The values were...");
   for(int k: val) System.out.print(k + " ");
}
}

