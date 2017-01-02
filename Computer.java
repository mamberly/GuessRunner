import java.util.Random;

/**
Computer class is a subclass of Person class and uses random logic to determine guess
*/
public class Computer extends Person
{
private int guess = 0;
Random rand = new Random();
   
   /*
   Computer method gets name and level and sends them to parent class
   */
   public Computer(String nm, String level)
   {
   super(nm, level);
   }
   
   /**
   guess method changes based on level. If easy, just guesses a random number and sends to superclass. If hard, guesses random number closer to real value and sends to superclass 
   @param int value
   @param int guess
   */
   public void guess(int val, int gu, int numguess)
   {
   if(getLevel() == 0 || (getLevel() ==1 && numguess < 1))
   {
      if(val < 500) guess = rand.nextInt(500);
      else guess = rand.nextInt(500) + 500;
      super.guess(val, guess);
   }
   else if (getLevel() == 1 && numguess >= 1)
   {
   if(val-getOldGuess() < 0) super.guess(val, -(val-getOldGuess()));
   else super.guess(val, (val-getOldGuess()));
   
   }
   }

}