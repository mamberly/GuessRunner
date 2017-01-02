/**
User class is a child of Person class and lets the user know how close they were
*/
public class User extends Person
{
   public User(String nm, String level)
   {
   super(nm, level);
   }
   
   /**
   Guess method sends value and guess to parent class but also calls difference method
   @param  int value
   @param int guess
   */
   public void guess(int val, int guess)
   {
   super.guess(val, guess);
   System.out.println("You were off by: " + difference(val, guess));
   }
      /**
   Difference method prints out how close the user was to the actual value
   @param value;
   @param guess;
   */
   public int difference(int val, int guess)
   {
   int test = val-guess;
   if(test < 0) test = -test;
   return test;
   }
  
}