import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

  public static int getCount(String str) {
    int count = 0;
		Pattern r = Pattern.compile("(?i)[aeiou]"); 
		Matcher m = r.matcher(str); 
		while (m.find()) { 
		   count++;
		}
    return count;
  }
}