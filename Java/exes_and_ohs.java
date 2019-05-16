public class XO {
  public static boolean getXO (String str) {
    int[] xo = {0,0}; 
    for(int i = 0; i <= (str.length()-1); i++){
      if (Character.toString(str.charAt(i)).equals("x") || Character.toString(str.charAt(i)).equals("X")) xo[0]++; 
      if (Character.toString(str.charAt(i)).equals("o") || Character.toString(str.charAt(i)).equals("O")) xo[1]++;
    }
    return xo[0] == xo[1];
  }
}