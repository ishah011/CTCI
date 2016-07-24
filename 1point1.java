import java.util

public class Test {
  public static bool main(String input[]){
    int[] charac;
    charac = new int[26];
    String lowInput = input.toLowerCase();
    for(int x = 0; x < lowInput.length(); x++){
      int asciiChar = lowInput.at(x).toASCII();
      int index = asciiChar - 'a';
      if(charac[index] == 0)
      {
        charac[index] = 1;
      }
      else{
        return false;
      }
    }
    return true;
  }
}
