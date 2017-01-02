/**
Person class is a superclass for users and computers to guess against each other 
*/
public class Person
{
private String name, level = "";
public  int score, guessReal, oldGuess = 0;
   /**
   Person constructor requires name and level
   @param String name
   @param String difficulty
   */
   public Person(String nm, String dificult)
   {
   name = nm;
   level = dificult;
   }
   
   /**
   Guess method calculates how close guess was to actual value
   @param int Value
   @param int guess
   */
   public void guess(int val, int guess)
   {
   guessReal = guess;
   if(val-guess == 0) score = 0;
   else if((val-guess)< 0) score-=(val-guess);
   else
   score += (val-guess);
   oldGuess = guess;
   }
   
   /**
   getOldGuess Method returns the old guess to be used by the computer 
   @return int oldGuess
   */
   public int getOldGuess()
   {
   return oldGuess;
   }
   
   /**
   getScore method determines if 2 Persons have the same score and if they do sets the scores to 0
   @param Person object of Person class
   @return score
   */
   public int getScore(Person per)
   {
   if (per.score == score) score = 0;
   return score;
   }
    
   
   /**
   getLevel method uses logic to determine what level user wants to play
   @return int level value
   */
   public int getLevel()
   {
   if(level.equalsIgnoreCase("easy")) return 0;
   else if(level.equalsIgnoreCase("hard")) return 1;
   return 0;
   }
   
   /**
   getGuess method returns the guess 
   @return int guessReal
   */
   public int getGuess()
   {
   return guessReal;
   }
   
 
}