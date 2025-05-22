import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private String[] words;
  private int numsleft;
  public RandomStringChooser(String[] wordArray){
    words = new String[wordArray.length];

    for(int i=0; i<wordArray.length; i++){
      words[i] = wordArray[i];
    }
    numsleft = words.length;
  }
  public String getNext() {
    if(numsleft==0){
      return "NONE";
    }
    int index= (int)(Math.random()*numsleft);
    String selected = words[index];
    words[index] = words[numsleft-1];
    numsleft--;
    return selected;
    }
  }
